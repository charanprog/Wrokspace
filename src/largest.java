import java.sql.SQLOutput;
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter values:");
        int n;
        int largest=Integer.MIN_VALUE;
        do{

            n = input.nextInt();
              if(n>largest){
                  largest=n;
              }
        } while (n != 0);
        System.out.println("The largest value entered is :"+largest);
    }
}