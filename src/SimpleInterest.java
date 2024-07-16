
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hey, there lets calculate SimpleInterst");
        System.out.println("Enter Principle amount in @Rs:");
        int P = input.nextInt();
        System.out.println("Enter rate of interest in @paisa:");
        int R = input.nextInt();
        System.out.println("Enter Time period in @months:");
        int T = input.nextInt();
        int sum = P*T*R/100;
        int total = P+sum ;
        System.out.println("The SimpleInterest is :"+"  "+sum);
        System.out.println("The Total Amount you has to pay is :"+" "+total);
        System.out.println("The total currency has too bee in rupees ");
        System.out.println("the intial setup has in ptr system");
        System.out.println("The parameter has to setup");
    }
}
