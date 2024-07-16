import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give your two values :");
        int a = input.nextInt();
        int b = input.nextInt();
        add(a,b);
    }

      static void add(int a,int b){
        int add = a+b;
          System.out.println("The sum of a,b: " +add);
      }
}
