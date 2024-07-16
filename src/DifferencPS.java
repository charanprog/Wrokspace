import java.util.Scanner;
//MyFirst leetc
public class DifferencPS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give an integer Vaule:");
        int n = input.nextInt();
        int difference ;
        int product = 1;
        int sum=0;
        while(n>0){
            int rem =n%10;
            int temp=0;
            temp+=rem;
            temp=sum;
            n/=10;
            product *= rem;
            sum=temp+rem;
        }
        difference=product-sum;
        System.out.println(difference);
    }
}
