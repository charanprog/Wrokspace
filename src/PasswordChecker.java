import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = input.nextInt();
        System.out.println(checker(str,n));
    }
    public static int checker (String str , int n){
        if(n<4)
            return 0;
        if(str.charAt(0)>=' '& str.charAt(0)<='/' | str.charAt(0)>='0'& str.charAt(0)<='9')
            return 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)>='A'& str.charAt(i)>='Z')
                if(str.charAt(i+1)>='0'& str.charAt(i+1)>='9')
                    return 1;
        }
        return 0;
    }
}
