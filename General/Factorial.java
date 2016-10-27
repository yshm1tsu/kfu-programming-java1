/**
 * n! = n * (n-1) * (n-2) * ... * 1
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class Factorial {
  public static void main(String[] args) {
    // Read input data
    if(args.length != 1){
      System.err.println("Please enter 1 parameter");
      System.exit(1);
    }
    int n = Integer.parseInt(args[0]);
    if(n<0){
      System.err.println("Parameter must be >=0.");
      System.exit(1); 
    }
    
    // Show factorial
    System.out.println(factRecursion(n));
    
  }
  
  // Calculate Factorial by simple way
  public static int factSimple(int n){
    if(n < 0){
      return -1;
    }
    int result = 1;
    for(int i=n; i>=1; i--){
      result = result * i;
    }
    return result;
  }
  
  // Calculate Factorial with recursion
  // n! = n * (n-1) * (n-2) * ... * 1 = n * (n-1)! = n * (n-1) * (n-2)!
  // 4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1 * 0!
  //    = 4 * 3 * 2 * 1 * 1
  public static int factRecursion(int n){
    // Check for input
    if(n < 0){
      return -1;
    }
    // Recursion exit condition
    if(n == 0){
      return 1;
    }
    return n*factRecursion(n-1);
  }
  
  // Another problem that can be solved with recursion
  // Check string for right using of brackets
  //  aa(d dsf(sdfdsfs )) - right
  // [()()()()((()))] - right
  // [(]) - wrong
}
