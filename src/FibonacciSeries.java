import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        while(n>=b){
            int temp = b;
            a=b;
            sum=sum+b;
            b++;
        }
        System.out.println("The sum of Fibanacci series upto n value :"+sum);

    }

}
