package Recursion.Basics;

public class StepsTakem {
    public static void main(String[] args) {
        System.out.println(Steps(14));
    }

    private static int Steps(int n) {
        return helperS( n,0);
    }

    private static int helperS(int n, int count) {
        if(n==0){
            return count;
        }
        if(n%2==0){
            return helperS(n/2,count+1);
        }
        return helperS(n-1, count+1);
    }

}
