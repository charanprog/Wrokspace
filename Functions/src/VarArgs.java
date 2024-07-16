import java.util.Arrays;

public class VarArgs {
    // variable length arguments

 /*   public static void main(String[] args) {
       // fun(1,2,3,3,4,5,6,5,5,4,4,4,5,44,3,3,34323,35323232);
        fun();
    }

     static void multiple(int a , int b, String...v){

    }
    static void fun(int...c){
        System.out.println(Arrays.toString(c));
    }

  */
 public static void main(String[] args) {
     demo(23);
     demo("kalyan");

 }
  static void demo(int ...a){
      System.out.println(Arrays.toString(a));

  }
  static void demo(String ...a){
      System.out.println(Arrays.toString(a));
  }




}
