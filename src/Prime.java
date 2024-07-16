import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = input.nextInt();
        IsPrime(n);
    }
       static int IsPrime(int n){
        if(n%2==0 && n%3==0){
            System.out.println("given number is a not prime");
        }
        else{
            System.out.println("give number is not a prime");
        }
        return n;
    }
}
