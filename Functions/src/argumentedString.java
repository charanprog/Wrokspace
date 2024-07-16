import com.sun.source.tree.SynchronizedTree;

import java.util.Scanner;

public class argumentedString {
    public static void main(String[] args) {
        System.out.println("Hii Dear ,please enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }
        static String myGreet(String name){
            String message = "hello " + name;

            return message;

        }

    }



