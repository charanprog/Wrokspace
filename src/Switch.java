import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /*
        String Fruit = input.next();

        switch (Fruit) {
            case "mango" -> System.out.println("summer king");
            case "orange" -> System.out.println("orange antey sunrisers kada ");
            case "grapes" -> System.out.println("small but sweet");
            default -> System.out.println("select a valid option");
        }



        int day = input.nextInt();

        switch (day){
            case 1 :

            case 2 :

            case 3:

            case 4:

            case 5 :
                System.out.println("weekday");
                break;
            case 6 :
            case 7:
                System.out.println("weekend");
                break;


        }

        */
        int day = input.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }
    }
}
