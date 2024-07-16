import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double r = input.nextDouble();
        double pi = 3.14;
        double p = 2*pi*r;
        System.out.println("perimeter of the circle is:"+ p);
    }
}
