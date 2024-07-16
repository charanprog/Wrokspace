import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Indian currency @RS:");
        int INR = input.nextInt();
        int USD = INR * 70; // in have taken usd currency as 1Rs=70usd
        System.out.println("Here is your USD currency :"+USD);
    }
}
