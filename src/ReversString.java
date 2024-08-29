import java.util.*;
public class ReversString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give your input:");
        String str = input.next();
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Original String:" + " " + str);
        System.out.println("Here is reversed String:" + " " + rev);
    }

}
