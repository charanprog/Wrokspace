import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of the radius:");
        int r = input.nextInt();
        int c=0;
        Area(r);
    }
        static int Area(int r){
           int pi=(int) 3.142;
           int f= pi*r*r;
           int c=2*pi*r;
            System.out.println("Area of the circle:"+f);
            System.out.println("Circumfarance of the circle:"+c);
            return f;
    }
}
