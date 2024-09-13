package Recursion.Basics.Arrays.sort;

public class sort {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,5,6};
        System.out.println(soredt(arr,0));
    }

    static boolean soredt(int[] arr,int i) {
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && soredt(arr,i+1);
    }
}
