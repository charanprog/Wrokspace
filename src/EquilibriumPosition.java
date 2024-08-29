import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumPosition {
    public static void main(String[] args) {
        int [] arr ={2,4,7,3,3};
        int n = 5;
        System.out.println(Position(arr,n));
    }
    public static int Position(int [] arr, int n) {
        int sumleft =0;
        int sumright=0;
       for(int i=1;i<n-1;i++) {
           sumright = sumright + arr[i + 1];
           sumleft = sumleft+ arr[i-1];
           if(sumright==sumleft)
               return i;
       }
//       for(int j=1;j<n-1;j++){
//            sumleft = sumleft +arr[j-1];
//       }
//        if(sumright==sumleft){
//            return 1;
//        }
      return 0;
    }
}

