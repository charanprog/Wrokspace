package Recursion.Basics;

public class rev2 {
    public static void main(String[] args) {
        System.out.println(palind(12343213));
    }
    static int reverse1(int n){
        // sometimes u need some additional variables in the arguements
        // in that case , make another function;
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);
    }

     static int helper(int n, int digits) {
        if (n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+ helper(n/10 ,digits-1);

    }
    public static boolean palind(int n){
        return n== reverse1(n);
    }

}
