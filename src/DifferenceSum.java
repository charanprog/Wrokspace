import java.util.Scanner;

public class DifferenceSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Divisor:");
        int n = input.nextInt();
        System.out.println("Enter series ender:");
        int m = input.nextInt();
        System.out.println(fun(n,m));
    }
    public static int fun(int n ,int m) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i =1;i<=m;i++){
            if(i%n==0){
                sum1= sum1+i;
            }
            else
                sum2=sum2+i;
        }
       return Math.abs(sum1-sum2);
    }
}
