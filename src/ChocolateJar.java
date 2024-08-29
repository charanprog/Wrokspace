import java.util.*;
public class ChocolateJar {
    public static void main(String[] args) {
        System.out.println("Enter Size of the Array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("Enter Elements into array !");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element" + " " + i);
            arr = new int[]{input.nextInt()};
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }
//    public static int fun(int[] arr,int n){
//               for(int i=0;i<n;i++){
//                   if(i==i){
//
//                   }
//               }
//        }
}
