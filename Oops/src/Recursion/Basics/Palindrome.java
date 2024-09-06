package Recursion.Basics;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println( palin(1234));
    }

    static int palin(int n) {

         int digits= (int)(Math.log10((n)+1));
        return helper1(n,digits);
    }
    static int helper1(int n,int digits){
        if(n%10==n) {
            return n;
        }
       int rem=n%10;
       return rem*(int)Math.pow(10,digits-1) + helper1(n/10,digits-1);
    }

}
