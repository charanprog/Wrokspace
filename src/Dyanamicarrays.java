import java.util.ArrayList;
import java.util.Scanner;
public class Dyanamicarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>(8);
        list.add(100);
        list.add(890);
        list.add(100);
        list.add(167);
        list.add(353);
        list.add(450);
        list.add(100);
        list.add(344);
        list.add(133);
        list.add(134);
        System.out.println(list.contains(353));
        list.set(0,25);
        list.remove(4);

        System.out.println(list);
        // input
        for(int i =0; i<5 ;i++){
            list.add(input.nextInt());
        }
        //get item any index
        for(int i=0; i<5;i++){
            System.out.println(list.get(i));
        }

        
    }
}

