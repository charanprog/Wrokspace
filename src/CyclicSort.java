import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] nums={5,4,3,2,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
        Cyclic(nums);
        System.out.println(Arrays.toString(nums));

    }
    // using while loop
    static void Cyclic(int[] nums){
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
    }
    // using for loop
     static void sort(int[] nums) {
        for(int i =0;i<nums.length-1;i++) {
            int correct = nums[i]-1;
            if (nums[i] != correct) {
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        }
    // swap function
    static void swap(int[]nums , int first , int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] =  temp;
    }
    }

