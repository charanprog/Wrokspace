import java.util.*;
import java.math.*;

public class MessageEncoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the message ");
        String str = input.next();
        str.toCharArray();
        String output = "";
        for(int i =str.charAt(0); i>str.length()-1; i++){
            int temp =(int)i*i;
            output = output+temp;
        }
        System.out.println(output);
    }
}
