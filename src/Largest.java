import java.sql.SQLOutput;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter any 2 numbers,i will tell you which is largerest:");
          int n1 = input.nextInt();
          int n2 = input.nextInt();
          if (n1>n2){
              System.out.println("Here is the largest value:"+n1);
          }
          if(n2>n1){
              System.out.println("Here is the largest value:"+n2);
          }
          if(n1==n2){
              System.out.println("you kidding ?\nyou Entered same values");
          }
    }
}
