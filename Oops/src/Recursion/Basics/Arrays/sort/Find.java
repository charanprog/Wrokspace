package Recursion.Basics.Arrays.sort;


import java.sql.SQLOutput;
import java.util.ArrayList;
public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
//        int target = 0;
//        int index = 0;
//        System.out.println(findallindex(arr,4,0,new ArrayList<>()));
        System.out.println(findallindex(arr,4,0));
    }

//   static int findindex(int[] arr, int target,int index) {
//        if(index== arr.length-1){
//            return -1;
//        }
//        if(arr[index]==target){
//            return index;
//        }
//        return findindex(arr, target, index+1);
//    }

    //    static boolean findindex(int[] arr, int target,int index) {
//        if(index== arr.length-1){
//            return false;
//        }
//        boolean b = arr[index] == target || findindex(arr, target, index + 1);
//        return b;
//    }
//    static ArrayList<Integer> list = new ArrayList<Integer>();
//    static ArrayList<Integer> arrayList= new ArrayList<>();
//    static void findallindex(int[] arr, int target, int index) {
//        if (index == arr.length - 1) {
//            return;
//        }
//        if (arr[index] == target) {
//            arrayList.add(index);
//        }
//        findallindex(arr,target,index+1);
//
//    }
//}
//    static ArrayList<Integer> arrayList= ;

    // parameterized arraylist in method
//    static ArrayList<Integer> findallindex(int[] arr, int target, int index,ArrayList<Integer>list) {
//        if (index == arr.length - 1) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//       return findallindex(arr, target, index+1, list);
//
//    }

    static ArrayList<Integer>  findallindex(int [] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index== arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> AddAllPossibleAns =findallindex(arr,target,index+1);
         list.addAll(AddAllPossibleAns);
        return list;
    }
}

