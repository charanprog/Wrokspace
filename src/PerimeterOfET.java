import java.util.Scanner;

public class PerimeterOfET {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of side of a Triangle:");
        double s = input.nextByte();
        double perimeter = 3*s;
        System.out.println("perimeter of Equilateral Traingle:"+ perimeter );
     }
}
