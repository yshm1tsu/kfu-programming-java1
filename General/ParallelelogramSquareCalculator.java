/**
 * Calculate square of parallelogram.
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class ParallelelogramSquareCalculator {
  public static void main(String[] args) {
    // Check input data
    if(args.length != 2){
      System.err.println("Please enter exactly 2 parameters!");
      System.exit(1);
    }
    int a = Integer.parseInt(args[0]);
    int h = Integer.parseInt(args[1]);
    if(a <=0 || h <= 0){
      System.err.println("Please enter exactly 2 positive numbers!");
      System.exit(1);
    }
    // Also check a and h
    
    // Calculate
    int square = getParSquare(a, h);
    System.out.println("Square is " + square + ".");
  }
  
  public static int getParSquare(int a, int h){
    return a*h;
  }
}
