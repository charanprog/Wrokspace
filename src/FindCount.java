import java.util.Scanner;

public class FindCount
{
    public static void main(String[] args) {
        int [] arr ={12,3,14,56,77,13};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int l = input.nextInt();
        System.out.println("Enter the number:");
        int num = input.nextInt();
        System.out.println("Enter the diff:");
        int diff = input.nextInt();
        System.out.println(countfun(arr,l,num,diff));
    }
    public static int countfun( int[] arr, int l, int num, int diff){
        int count=0;
        for(int i=0; i< arr.length;i++){
            if(Math.abs(arr[i]-num)<=2){
                count++;
            }
        }
        return count;
    }
}
