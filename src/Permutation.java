import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9};
        int target = 4;
        int ans = squareroot(nums, target);
        System.out.println(ans);
    }

    static int squareroot(int[] nums, int target) {
        int ans = target;
        for (int i = 0; i < nums.length ;++i) {
            if (target % nums[i] == 0) {
                if (nums[i] * nums[i] ==target ) {
                    return nums[i];
                }

            }

        }
        return -1;

    }
}
