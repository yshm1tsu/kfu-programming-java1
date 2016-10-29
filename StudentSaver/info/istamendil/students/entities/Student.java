package info.istamendil.students.entities;
/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class Student extends Human{
  private University university;
  
  public Student(String name, float weight) {
    super(name, weight);
    // Some logic
  }
  
  public Student(String name, float weight, University university) {
    this(name, weight);
    this.university = university;
  }

  public University getUniversity() {
    return university;
  }

  public void setUniversity(University university) {
    this.university = university;
  }
  
  public String toString(){
    return this.getName() + " ( " + this.getWeight() + " )";
  }
  
}
