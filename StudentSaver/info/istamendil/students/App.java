package info.istamendil.students;

import info.istamendil.students.utils.EndlessArray;
import info.istamendil.students.entities.University;
import info.istamendil.students.entities.Student;
import info.istamendil.students.utils.ConsoleInterface;

/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class App {

  private ConsoleInterface ci;
  private EndlessArray students;
  private University mainUni;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    new App();
  }

  public App() {
    mainUni = new University("Kazan Federal University");
    students = new EndlessArray();
    ci = new ConsoleInterface(System.in, System.out);

    while (!ci.askedForExit()) {
      switch (ci.getLastInput()) {
        case "help":
          showHelp();
          break;
        case "new":
          students.add(this.readNewStudent());
          break;
        case "read_all":
          System.out.println(students);
          break;
        default:
          System.out.println("Unkown command");
          showHelp();
      }
    }
  }

  public Student readNewStudent() {
    String name;
    Float weight;
    name = ci.readString("Name");
    weight = Float.parseFloat(ci.readString("Weight"));
    return new Student(name, weight, mainUni);
  }

  public void showHelp() {
    System.out.println("Available commands: help, new, read_all. For exit type " + ci.getExitCommand()+".");
  }

}
