package Recursion.Basics.permutations;
import java.util.*;
public class StringDemo {
    public static void main(String[] args) {
        skiptheword("bgapplebfg", "");
    }

    private static String removea(String O) {
        if (O.isEmpty()) {
            return "";
        }
        char ch = O.charAt(0);
        if (ch == 'a') {
            return removea(O.substring(1));
        } else {
            return ch + removea(O.substring(1));
        }

    }

    static void skip(String Original, String Duplicate) {
        if (Original.isEmpty()) {
            System.out.println(Duplicate);
            return;
        }
        char ch = 'a';
        if (Original.charAt(0) == ch) {
            skip(Original.substring(1), Duplicate);
        } else {
            skip(Original.substring(1), Duplicate + Original.charAt(0));
        }

    }


    static void skiptheword(String Word,String removedWord) {
            if(Word.isEmpty()){
                System.out.println(removedWord);
                return;
            }
            if(Word.charAt(0)=='a'){
                skiptheword(Word.substring(5),removedWord);
            }
            else{
                skiptheword(Word.substring(1),removedWord+Word.charAt(0));
            }
    }
}