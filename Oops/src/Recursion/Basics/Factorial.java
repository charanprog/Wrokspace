package Recursion.Basics;

public class Factorial {
    public static void main(String[] args) {
        int ans = fact(1);
        System.out.println(ans);
    }

//  static int fact(int n) {
//        if(n==0){
//            return 1;
//        }
//        return n*fact(n-1);
//        }


    static int fact(int n) {
        if(n>=5){
            return n;
        }
        return n*fact(n+1);
    }



}
