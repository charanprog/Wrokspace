import java.lang.reflect.Array;
import java.util.Arrays;

public class PassinginFunction {

    public static void main(String[] args) {
        int num[]= {1,4,5,6,9};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    // mutable = we can change / modify
     // inmutable = we cannot change ;
    // in java strings are in inmutable
    // in java arrays are in mutable

    static void change(int [] arr){
         arr[3]=28;
    }
}
