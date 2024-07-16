
import java.util.Arrays;

import static java.util.Collections.swap;

public class Swap {
 public static void main (String[]args) {

         int[] arr = {1, 4, 6, 9, 8};
         swap(arr, 4, 2);
         System.out.println(Arrays.toString(arr));
 }
 static void swap(int[] arr , int index1, int index2) {
     for (int i = 0; i < 5; i++) {
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
     }
 }
}
