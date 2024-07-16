import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the base of the Triangle:");
        double b = input.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double h = input.nextDouble();
        double a = 0.5*b*h;
        System.out.println("Area of the IsoscelesTraingle is:"+a);

    }
}
