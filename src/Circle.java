import java.util.Scanner;
// formula = 3.14*r*r
public class Circle {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter the radius of the circle :");
          double r = input.nextDouble();
          double a = 3.14*r*r;
          System.out.println("Area of the circle is:"+ a);

    }
}
