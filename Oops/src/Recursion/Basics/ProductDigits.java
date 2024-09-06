package Recursion.Basics;

public class ProductDigits {
    public static void main(String[] args) {
        int ans= product(7996);
        System.out.println(ans);
    }

    static int product(int n) {
        if(n==0){
            return 1;
        }
        return (n%10) * product(n/10);
    }
}
