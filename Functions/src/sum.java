import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
         int ans = sum2();
        System.out.println(ans);// functional call
        // it has a value
    }


      // return a value
         static int sum2(){

             Scanner input = new Scanner(System.in);
             System.out.println("Enter first number:");
             int n1 = input.nextInt();
             System.out.println("Enter second number:");
             int n2 = input.nextInt();
             int sum = n1+n2 ;
             System.out.println("The sum of two numbers is : " + sum);
             return sum;

         }
         

         static  void sum(){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter first number:");
         int n1 = input.nextInt();
         System.out.println("Enter second number:");
         int n2 = input.nextInt();
         int sum = n1+n2 ;
         System.out.println("The sum of two numbers is : " + sum);
     }




    /*

          Access modifier return_type name {
          /// body
              return statement ;
              }

     */
}
