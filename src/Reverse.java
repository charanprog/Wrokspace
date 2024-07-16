import java.util.Scanner;


public class Reverse {
    public static void main(String[] args) {
     /*  Scanner input = new Scanner(System.in);
       int n = input.nextInt();

        int ans = 0;
        while(n>0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);


      */
         int a = 12345;
         int b = 0 ; //  answer
         while(a>0){
             int rem = a % 10;
             a/=10;
             b = b * 10 + rem ;


         }
        System.out.println(b);
        }

    }
