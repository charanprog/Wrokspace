import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String palindrome = input.nextLine();
        String original = palindrome;
        StringBuilder rev = new StringBuilder(palindrome);
        rev.reverse();
        if (palindrome.equals(rev.toString())){
            System.out.println("This is palidrome");
        }
        else {
            System.out.println("edhi palidrome kadu mawa");
        }

    }
}
