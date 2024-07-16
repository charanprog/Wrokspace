import java.util.Scanner;
public class Occurance {
    public static void main(String[] args) {
     /*   Scanner  input = new Scanner (System.in);
        int  in = input.nextDouble();


      */
       /* int val = 345556 ;
        int count = 0;
        while(val>0){
            int rem= val%10;
           (rem==5){
                count++;

             }
            val =val/10;

        }
        System.out.println(count);

        */
        // Q: find the occurance of A in B
        // a= 0 , b = 1000
        System.out.println("Enter any value:");
       Scanner input = new Scanner(System.in);
       long b = input.nextLong();
        int count = 0;
        while(count<b){
             long rem = b%10 ;
              if(rem==0){
                  count++;
              }
              b=b/10;
        }
        System.out.println("Here is the occurance of value : " + count);



    }
}
