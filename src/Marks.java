import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Marks:");
        int marks  = input.nextInt();
        grades(marks);

    }

     static int grades(int marks) {
        if(91<=marks && marks>=100){
                    System.out.println("you grade is:AA");
        }
         if(81<=marks || marks>=90){
             System.out.println("you grade is:AB");
         }
         if(71<=marks || marks>=80){
             System.out.println("you grade is:BB");
         }
         if(61<=marks || marks>=70){
             System.out.println("you grade is:BC");
         }
         if(51<=marks || marks>=60){
             System.out.println("you grade is:CD");
         }
         if(41<=marks || marks>=50){
             System.out.println("you grade is:DD");
         }
         if(40>=marks){
             System.out.println("you got failed");
         }
        return marks;
    }
}
