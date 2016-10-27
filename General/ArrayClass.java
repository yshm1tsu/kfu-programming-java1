
import java.util.Arrays;

/**
 *
 * @author Alexander Ferenets <ist.kazan@gmail.com>
 */
public class ArrayClass {
  public static void main(String[] args) {
    // Read and parse input data
    int[] myArr = new int[args.length];
    for(int i=0; i<args.length ; i++){
      myArr[i] = Integer.parseInt(args[i]);
    }
    // Show it
    System.out.println(Arrays.toString(myArr));
    // Sort
    bubbleSortArray(myArr);
    //Arrays.sort(myArr); // Java library way
    // Show sorted array
    System.out.println(Arrays.toString(myArr));
  }
  
  // Sort array with bubble sorting
  public static void bubbleSortArray(int[] arr){
    boolean swapped = true;
    int temp;
    while(swapped){
      swapped = false;
      for(int i=0; i<arr.length-1; i++){
        if(arr[i] > arr[i+1]){
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          swapped  = true;
        }
      }
    }
  }
}
