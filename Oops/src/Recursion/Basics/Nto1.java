package Recursion.Basics;



public class Nto1 {
    public static void main(String[] args) {
        funn(5);
    }

     static void funn(int n) {
        if(n==0){
            return;
        }
         System.out.println(n);
          funn(n-1);
    }
}
