import java.util.Scanner;

import static java.lang.Math.min;

public class MaxMIn {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Give any three numbers:");
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        max(n1,n2,n3);
        min(n1,n2,n3);
    }

     static void max(int n1,int n2,int n3) {
        if(n1>n2 && n1>n3){
            System.out.println("The largest value is:"+n1);
        }
        if(n2>n1 && n2>n3){
            System.out.println("The largest value is:"+n2);
        }
        if(n3>n1 && n3>n2){
            System.out.println("The largest value is:"+n3);
        }

    }
     static void min(int n1,int n2,int n3){
         if(n1<n2 && n1<n3){
             System.out.println("The Smallest value is:"+n1);
         }
         if(n2<n1 && n2<n3){
             System.out.println("The Smallest value is:"+n2);
         }
         if(n3<n1 && n3<n2){
             System.out.println("The Smallest value is:"+n3);
         }

     }
}
