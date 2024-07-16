public class Overloading {

    public static void main(String[] args) {
        fun(24);
        fun("mahesh");
        sum(20,40);
        sum(23,445,566);

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);

    }
    static void sum(int a , int b){
        int sum = a + b ;
        System.out.println(sum);
    }
    static void sum(int a ,int b,int c){
        int sum = a+b-c ;
        System.out.println(sum);
    }


}
//compile run
// function overlading can be done by using different parameters or with number of inputs
