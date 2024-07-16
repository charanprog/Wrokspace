import java.awt.*;
import java.util.Scanner;

public class MultiDimensionArray1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] a = new int[3][3];
        //input
        for(int rows=0;rows<a.length;rows++){
               for(int columns=0;columns<a[rows].length;columns++){
                   a[rows][columns]=input.nextInt();
               }
        }
        // output
        for(int rows=0;rows<a.length;rows++){
            for(int columns=0;columns<a[rows].length;columns++){
                System.out.print(a[rows][columns]);
            }
            System.out.println();
        }

    }
}
