package Keywords;

public class SuperDemo {
    public static void main(String[] args) {
        child c = new child();
       c.displayvalue();
       c.displayval();
    }
}
class parent{
    int x=100;
}
class child extends parent{
    int x=200;

    void displayvalue(){
        System.out.println(super.x);
    }
    void displayval(){
        System.out.println(x);
    }
}

