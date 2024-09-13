package Recursion.Basics.permutations;

import java.util.Arrays;

public class SequenceDemo {
    public static void main(String[] args) {
        possibleOutcome("abc","");
    }

     static void possibleOutcome(String original,String Processed) {
        if(original.isEmpty()){
            System.out.print(" " + Processed);
            return;
        }
        char ch = original.charAt(0);
        possibleOutcome(original.substring(1),Processed+ch);
        possibleOutcome(original.substring(1),Processed);



    }

}
