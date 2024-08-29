import java.util.*;
public class StringTypes {
    //String
    // Stringbuffer
    // String builder
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Welcome");
        System.out.println(s.reverse());
        StringBuilder f = new StringBuilder("India");
        System.out.println(f.reverse());
        System.out.println(f.deleteCharAt(2));
    }
    // imutable concepts
}
