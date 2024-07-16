import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long salary =  input.nextLong();

      /*  if (salary<10000){
            salary += 2000;
            System.out.println(salary);
        }
        else {
            salary +=89000;
            System.out.println(salary);
        }

       */

        if(salary<10000){
            salary +=90000;
            System.out.println(salary);
        }
        if(salary>20000){
            salary+=18000;
            System.out.println(salary);
        }
        else if(salary>=24000){
            salary+=10000;
            System.out.println(salary);

        }
        else {
            salary-= 2300;
            System.out.println(salary);
        }
    }

}
