import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give your two values :");
        int a = input.nextInt();
        int b = input.nextInt();
        product(a,b);
    }

    static void product(int a,int b){
        int add = a*b;
        System.out.println("The product of a,b: " +add);
    }
}
