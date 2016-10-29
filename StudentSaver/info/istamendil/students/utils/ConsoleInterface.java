package info.istamendil.students.utils;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class ConsoleInterface {
  private static final String COMMAND_EXIT = "exit";
  
  private final Scanner scanner;
  private final PrintStream ps;
  
  private String lastInput;
  
  public ConsoleInterface(InputStream is, PrintStream os){
    this.ps = os;
    this.scanner = new Scanner(is);
  }
  public boolean askedForExit(){
    this.readCommand();
    if(this.lastInput.equals(COMMAND_EXIT)){
      return true;
    }
    return false;
  }
  public String getExitCommand(){
    return COMMAND_EXIT;
  }
  public String getLastInput(){
    return this.lastInput;
  }
  public String readCommand(){
    return this.readString(">");
  }
  public String readString(String welcomeString){
    this.ps.print(welcomeString);
    this.ps.print(" ");
    this.lastInput = this.scanner.nextLine();
    return this.lastInput;
  }
}
