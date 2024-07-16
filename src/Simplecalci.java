import java.util.Scanner;

public class Simplecalci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int n1= input.nextInt();
        int n2 = input.nextInt();
        System.out.println("Enter operation to be performed :");
        char c = input.next().trim().charAt(0);
        if (c == '+'){
            int sum = n1+n2;
            System.out.println("the sum of given two numbers is :"+sum);
        }
        if (c == '-'){
            int sum = n1-n2;
            System.out.println("the difference of given two numbers is :"+sum);
        }
        if (c == '*'){
            int sum = n1*n2;
            System.out.println("the product of given two numbers is :"+sum);
        }
        if (c == '/') {
            if (n2 != 0) {
                    int sum = n1 / n2;
                    System.out.println("the sum of given two numbers is :" + sum);
            }
            if (n2==0){
                System.out.println("operation cannot be perfomred !");
            }
        }
    }


}

