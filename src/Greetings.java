import java.util.Scanner;

public class Greetings{
    public static void main(String[] args) {
        System.out.println("Hii Dear,please enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("hello"+ " " + name + "  "+"good morning");
    }
}

