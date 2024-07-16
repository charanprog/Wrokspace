import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String Department = input.nextLine();

        switch (empID) {
            case 1 -> System.out.println("Charan Midathapally ");
            case 2-> System.out.println(" rohit sharma ");
            case 3-> {
                System.out.println("emp number:3");
                switch (Department) {
                    case "it" -> System.out.println("it department");
                    case "mech" -> System.out.println("mech department ");
                    default -> System.out.println("department not mentioned ");
                }
            }
            default -> System.out.println("enter correct feild");
        }
    }
}
