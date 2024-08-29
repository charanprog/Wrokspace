import java.util.Arrays;

public class ArraysAverage {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2, 6};
        Arrays.sort(arr);
        int n = 6;
        int avg = arr[1] + arr[2] / 2;
        int min_sum = 0;
        for (int x=0;x<arr.length-1;x++ ) {
            if (arr[x] <= 2)
                min_sum += arr[x];
        }
        System.out.println(min_sum);
    }
}
//    public static int average(int [] arr, int n){
//        int temp = 0;
//        for(int x=0;x<arr.length;x++) {
//
////            int avg = arr[x]+arr[x+1]/2;
////            if(arr[x]<=avg){
////                arr[x] = 0;
////            }
//        }
//        for( int y:arr){
//             temp = temp+y;
//        }
//
//        return temp;
//
//    }
//}
