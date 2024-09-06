package Recursion.Basics;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println( count(302040045));
    }

    private static int count(int n) {
        return helper3(n,0);
    }

    private static int helper3(int n, int c) {
        if(n==0){
            return c;
        }
        int rem= n%10;
         if(rem==0){
            return helper3(n/10,c+1);
         }
         return helper3(n/10,c);
    }


}
