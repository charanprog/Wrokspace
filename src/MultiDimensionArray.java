import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9

         */

        //  int [][] array= new int[2][3];//

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Array values");
        int[][] a = new int[3][2];
        // input
        for (int rows = 0; rows < 3; rows++) {
            for (int columns = 0; columns < 2; columns++) {
                a[rows][columns] = input.nextInt();
            }
        }
            // output
            for (int rows = 0; rows < 3; rows++) {
                for (int columns = 0; columns < 2; columns++) {
                    System.out.print(a[rows][columns] + " ");
                }
                System.out.println();
            }
        }
    }

