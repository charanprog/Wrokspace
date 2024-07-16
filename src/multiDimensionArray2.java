import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("Enter your input array values:");
        // input
        for(int rows=0;rows<a.length;rows++){
            for(int col =0;col<a[rows].length;col++) {
                a[rows][col] = input.nextInt();
            }
        //output
            System.out.println(Arrays.toString(a[rows]));
        }
    }
}
