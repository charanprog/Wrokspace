import java.sql.SQLOutput;
import java.util.*;
public class MagicString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("String that eva had:");
        String orginal = input.next();
        orginal.toCharArray();
      //  System.out.println("Enter char that eva want to replace:");
        char c ='c';
        int count =0;
        for(int i=0;i<orginal.length();i++){
            if(orginal.charAt(i)!=c){
                count ++;
            }
        }
        System.out.println(count);

    }
}
