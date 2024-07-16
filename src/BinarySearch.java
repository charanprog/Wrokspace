public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2, 3 ,5 ,7 ,8,19,35,47,53};
        int target = 7;
        int ans = mid(arr,target);
        System.out.println(ans);
    }
    static int mid(int[]arr,int target) {
        int start = 0;
        int end = arr.length - 1;
          while (start <= end) {
            int mid = start+(end - start) / 2;

            if (target<arr[mid]) {
                end = mid - 1;
            } else if (target >arr[mid]) {
                start = mid +1;
            }
            if (arr[mid] == target) {
                return mid;
            }

        }
        return -1;
    }

}
