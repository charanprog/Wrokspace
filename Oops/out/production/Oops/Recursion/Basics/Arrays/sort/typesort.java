package Recursion.Basics.Arrays.sort;

import java.util.Arrays;

public class typesort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1};
//        SelectionSort(arr, arr.length-1,0);
        bublesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

//static void SelectionSort(int [] arr,int s, int i) {
//
//    if(s==0){
//        return;
//      }
//            if(i<s){
//            if(arr[i]> arr.length-1[i]){
//                //swap
//                int temp = arr[i];
//                arr[i]= arr[i+1];
//                arr[i+1]=temp;
//            }
//    }
    static void bublesort(int [] arr,int s, int i ) {
        if(s==0){
            return;
        }
        if(i<s){
            if(arr[i]>arr[i+1]){
                //swap
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
            }
            bublesort(arr,s,i+1);
        }else{
            bublesort(arr,s-1,0);
        }
    }
}