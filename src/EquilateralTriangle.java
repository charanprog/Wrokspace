import java.sql.SQLOutput;
import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a side:");
        double s = input.nextDouble();
        double s2 = s*2;
        double f = 0.433012702;
        double a = (f)*s2;
        System.out.println("Area of EquilateralTriangle is:"+a);
    }
}
