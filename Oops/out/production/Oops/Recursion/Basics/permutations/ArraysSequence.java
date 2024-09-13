package Recursion.Basics.permutations;

import java.util.ArrayList;
import java.util.List;

public class ArraysSequence {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans = Subsequence(arr);
        System.out.println(ans);
//

    }
/// recursin program to iteratorrrrrr
    private static List<List<Integer>> Subsequence(int [] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int n= outer.size();
            for (int i =0;i<n;i++){
               List<Integer>internal= new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
