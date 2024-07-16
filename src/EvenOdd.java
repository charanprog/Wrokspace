import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n= input.nextInt();;
        EvenOdd(n);
    }
       static void EvenOdd(int n){
           if(n%2==0){
               System.out.println("Given number is Even");
           }
           else{
               System.out.println("Given nuber is odd");
           }
       }
}
