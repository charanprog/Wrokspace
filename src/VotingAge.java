import java.sql.SQLOutput;
import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dear Mr/Miss Please Enter your age:");
        int n = input.nextInt();
        VotingAge(n);
    }
        static void VotingAge(int n){
        if(n>=18){
            System.out.println("Dear Mr/Miss you are eligible you vote");
        }
        else{
            System.out.println("Dear Mr/Miss you are not eligible to vote");
        }
        }
}
