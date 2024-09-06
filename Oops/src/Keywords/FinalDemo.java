package Keywords;

public class FinalDemo {
 static public void main(String[] args) {
        Test t = new Test();
      //  t.a=300;
     t.x=45;
     System.out.println(t.a);
        System.out.println(t.x);//t.x
    }
}
class Test {
    int x = 100;
    final int a =200;
}

