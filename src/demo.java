import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
      //  int[] data = new int[6];
        System.out.println("Please input your array values:");
        // intialization
       ///for(int i = 0; i<data.length;i++){
         //    data[i] = input.nextInt();
      //  }
      // easy method to print the whole array
     //   System.out.println(Arrays.toString(data));
      // loop way to print the method
     /*   for (int i=0;i<data.length;i++){
            System.out.println(data[i]+" ");
        }



       // it is for each loops ,another way to print the values
         for (int num : data){
             System.out.println(num +" ");
         }

      */
        String[]str = new String[5];
        for(int i =0 ; i<str.length;i++){
            str[i]= input.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        str[1]= "charan";
        System.out.println(Arrays.toString(str));
    }
}
