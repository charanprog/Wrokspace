public class MaxRange {
    public static void main(String[] args) {
        int[] arr = {4, 7,85 ,94,89};
        System.out.println(max (arr, 1,3)) ;
    }
    static int max(int []arr , int start , int end){
        int maxvalue = arr[start];
        for(int i = start; i<end ;i++){
            if(arr[i]>maxvalue){
             maxvalue = arr[i];
            }
        }
            return maxvalue;
    }
}
