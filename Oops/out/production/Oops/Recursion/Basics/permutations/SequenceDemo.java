package Recursion.Basics.permutations;

import java.util.Arrays;

public class SequenceDemo {
    public static void main(String[] args) {
//      possibleOutcome("abc","");
        Acsvalue("abc","");
//
//        char ch = '@';
//        System.out.println(ch+0);
    }
//many sequenc variables only one obj created
     static void possibleOutcome(String original,String Processed) {
        if(original.isEmpty()){
            System.out.print(Processed);
            return;
        }
        char ch = original.charAt(0);
        possibleOutcome(original.substring(1),Processed+ch);
        possibleOutcome(original.substring(1),Processed);

    }
//    static  void Ascvalue(S)
static void Acsvalue(String original,String Processed) {
    if(original.isEmpty()){
        System.out.println(Processed);
        return;
    }
    char ch = original.charAt(0);
    Acsvalue(original.substring(1),Processed+ch);
    Acsvalue(original.substring(1),Processed);
    Acsvalue(original.substring(1),Processed+(ch+0));


}

}
