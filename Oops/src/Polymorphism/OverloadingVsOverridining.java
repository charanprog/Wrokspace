package Polymorphism;

public class OverloadingVsOverridining {
    public static void main(String[] args) {
        xyz f= new xyz();
       f.m2(3);
       f.m2(23,34);
       f.m1(90);

    }

    }
class abc{
    void m1(int a){
        System.out.println(a);
    }
    void m2(int b){
        System.out.println(b);
    }
}
class xyz extends abc {
    void m1(int a) {
        System.out.println(a * a);

    }

    void m2(int a, int b) {
        System.out.println(a + b);
    }
}