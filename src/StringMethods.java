import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

import static javax.swing.UIManager.get;

public class StringMethods {
    public static void main(String[] args) {
        String str = "welcome";
        HashMap<Integer , String> set = new HashMap<>();
            set.put(1,"a");
            set.put(2,"e");
            set.put(3,"i");
            set.put(4,"o");
            set.put(5,"u");
        System.out.println(set);
    }
    
}
//        System.out.println(str.strip());
//        System.out.println(str.charAt(2));
//        System.out.println(str.indexOf(6));
//        System.out.println(str.indexOf('e'));
//////        System.out.println(str.getBytes(StandardCharsets.UTF_8));
////        System.out.println(Arrays.toString(str.getBytes(str)));
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toCharArray());
//        System.out.println(str.trim());
//        System.out.println(str.replace('e','f'));