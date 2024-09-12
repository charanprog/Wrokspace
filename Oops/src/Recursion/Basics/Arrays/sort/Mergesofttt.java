package Recursion.Basics.Arrays.sort;

import java.util.Arrays;

public class Mergesofttt {
    public static void main(String[] args) {
        int[] arr={1,3,7,8,2,6,98,6};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

   static int[] mergesort(int[]arr) {
        if(arr.length-1==0){
            return arr;
        }
        int centre = arr.length/2;
        int[] first =mergesort(Arrays.copyOfRange(arr,0,centre));
        int [] second = mergesort(Arrays.copyOfRange(arr,centre,arr.length));

        return merge(first,second);

    }

    private static int[] merge(int[] first, int[] second) {
        int [] mix = new int[first.length+second.length];
                int i=0;
                 int j=0;
                 int k =0;
                 while(i< first.length&&j<second.length){
                     if(first[i]<second[j]){
                         mix[k]= first[j];
                         i++;
                     }else{
                         mix[k]=second[j];
                         j++;
                     }
                     k++;
                 }
                 while(i< first.length){
                     mix[k]=first[i];
                     i++;
                     k++;
                 }
        while(i< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
           return mix;
    }


}
