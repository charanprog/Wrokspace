import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[][] = new int[3][3];
        for (int rows = 0; rows < a.length; rows++) {
            for (int col = 0; col < a[rows].length; col++) {
                a[rows][col] = input.nextInt();
            }
            for (int[] num : a) {
                System.out.println(Arrays.toString(num));

            }
        }
    }
}