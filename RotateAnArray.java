//not passing some testcases
import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//        System.out.println();
        rotate(nums  , k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[(n-k+i)%n];
        }

        for (int i = 0; i < n; i++) {
            nums[i]= ans[i];
        }
//        System.out.println(Arrays.toString(ans));
    }
}
