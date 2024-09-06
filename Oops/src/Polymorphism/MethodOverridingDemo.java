package Polymorphism;

class Bank{
    double roi(){
        return 0;
    }
}
class Icici extends Bank{
  double roi()  {
        return 10.05;
    }
}
class sbi extends Bank{
    double roi(){
        return 11.5;
    }
}



public class MethodOverridingDemo {
    public static void main(String[] args) {
         sbi c = new sbi();
        System.out.println(c.roi());
        Icici v= new Icici();
        System.out.println(v.roi());
        Bank b = new Bank();
        System.out.println(b.roi());
    }

}
