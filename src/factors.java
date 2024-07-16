import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give an input to find its factors:");
        int n = input.nextInt();
        int i;
        for ( i = 1; i <= n; i++) {
            while (n%i == 0) {
                System.out.println(i);
                i++;

            }
        }


    }
}