import java.util.Scanner;

public class Parallelogram {
    //Area of paralellogram
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the parellelogram:");
        double  b = input.nextDouble();
        System.out.println("Enter the height of the parellelogram");
        double  h = input.nextDouble();
        double  a = b*h;
        System.out.println("Area of the parellelogram is:"+a);
    }
}
