package Recursion.Basics.Arrays.sort;

import java.util.Scanner;

public class fio {
    public static void main(String[] args) {
//        int firstval=0;
//        int secondval=1;
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N value:");
        int n = input.nextInt();
        for (int i=0;i<=n;i++){
//            for (int j=i+1;j<i;j++){
//                sum=sum+i+j;
//            }
            sum=sum+i;
            System.out.println(sum);

        }


    }
}
