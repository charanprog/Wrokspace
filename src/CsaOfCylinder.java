import java.util.Scanner;

public class CsaOfCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the heigth of the cylinder:");
        double h = input.nextDouble();
        System.out.println("Enter the radius of the cylinder:");
        double r = input.nextDouble();
        double pi = 3.14;
        double c = 2*pi*r*h;
        System.out.println("CurvedSurfaceArea of a Cylinder is:"+ c);

    }
}
