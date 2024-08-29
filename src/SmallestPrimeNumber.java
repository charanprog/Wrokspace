import java.util.*;
public class SmallestPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your input:");
        int N = input.nextInt();
        System.out.println(prime(N));
    }
     public static int prime(int n){
           for(int i=n+1;i>n;i++){
               if(i%1==0 & i%i==0 & i%4!=0 & i%6!=0){
                   return i;
               }
           }

        return -1;
     }
}
