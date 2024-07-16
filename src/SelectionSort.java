import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [ ] nums = {4,5,1,2,3};
        sort(nums);
        System.out.println(Arrays.toString(nums ));
    }
    static void sort(int [] nums){
       for(int i =0;i<nums.length-1;i++){
           // find the max item in the reamining array and swap with correct index
           int last= nums.length-i-1;
           int maxindex = getMaxIndex(nums,0,last);
           swap(nums,maxindex,last);
       }
    }
    static void swap(int[]nums,int first,int second){
        int temp = nums[first];
        nums[first]= nums[second];
        nums[second]=temp;

    }
    static int getMaxIndex(int[]nums,int start,int end){
        int max= start;
        for(int i=start;i<=end;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
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
                    swapped = true ;
                }

            }
            if(!swapped){
                break;
            }
        }

    }
}
