import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      // lets take input from the user until the user doesnt press X or x
      int ans = 0;

        while(true){
            System.out.println("Enter the two inputs:");
                  int input1 = input.nextInt();
                  int input2 = input.nextInt();
            System.out.print("enter the operation to be performed:  ");
            char op = input.next().trim().charAt(0);
                  if(op=='+' || op=='-' || op=='*' || op=='/' ||op=='%' ){
                      if (op=='+'){
                          ans = input1 + input2 ;
                          System.out.println(ans);
                      }
                      if (op=='-'){
                          ans = input1 - input2 ;
                          System.out.println(ans);
                      }
                      if (op=='*'){
                          ans = input1 * input2 ;
                          System.out.println(ans);
                      }
                      if (op=='/') {
                          if (input2 != 0) {
                              ans = input1 / input2;
                              System.out.println(ans);
                          }
                      }
                      if (op=='%') {
                          if (input2 != 0) {
                              ans = input1 % input2;
                              System.out.println(ans);
                          }
                      }


                  }
                  else if (op== 'X'|| op=='x') {
                      break;

                  }
                  else{
                      System.out.println("This operation cannot be performed !");
                  }


        }
    }
}
