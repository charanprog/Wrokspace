
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int fact = 1;
        Factorial(n,fact);
    }
    static void Factorial(int n,int fact){
        while(n>1){
        int product = fact*(n-1);
        n++;
        }
    }
}