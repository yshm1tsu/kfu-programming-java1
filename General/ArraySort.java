
import java.util.Arrays;

/**
 *
 * @author Alexander Ferenets (Istamendil) <ist.kazan@gmail.com>
 */
public class ArraySort {

  public static void main(String[] args) {
    // Timer variable
    double startTime, timeDifferece;

    // Size of array for test
    int size = 10000;

    // Array for test
    int[] arr = new int[size];

    // Fill array with random values
    for (int i = 0; i < size; i++) {
      arr[i] = (int) Math.round(Math.random() * 1000);
    }
//    System.out.println("Generated array:");
//    System.out.println(Arrays.toString(arr));

    // Remember start time
    startTime = System.nanoTime();

    sortJavaSimple(arr);
//    sortBubble(arr);

    // Calculate time wasted for sorting
    timeDifferece = (System.nanoTime() - startTime) / 1e6;

//    System.out.println("Result array:");
//    System.out.println(Arrays.toString(arr));
    System.out.format("Time used for sorting: %.0fms\n", timeDifferece);
  }

  public static void sortJavaSimple(int[] arr) {
    Arrays.sort(arr);
  }

  public static void sortBubble(int[] arr) {
    int j;
    boolean flag = true;            // set flag to true to begin first pass
    int temp;

    while (flag) {
      flag = false;                 //set flag to false awaiting a possible swap
      for (j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]){
          temp = arr[j];            //swap elements
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          flag = true;              //shows a swap occurred 
        }
//        System.out.println(Arrays.toString(arr));
      }
    }
  }
}
