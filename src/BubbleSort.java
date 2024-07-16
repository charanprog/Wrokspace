import  java.util.Arrays;
public class BubbleSort {
    // Comparision type
    // in every step we will compare adjacent elements
    // swapping will takes place                                                                           !
    //bubble sort = sinking sort = exchangesort !
    public static void main(String[] args) {
        int[] nums = {7,8,-4,-32,-65,0};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println();
    }
     static void bubble(int[]nums){
         boolean swapped;
        for(int i=0;i< nums.length;i++){
            swapped =false;
            for (int j=1;j< nums.length;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped = true;

                }

            }
            if(!swapped){
                break;
            }
        }

     }
}
