//https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {3, 5, 0, 0, 4};
        pushZerosToEnd(nums, n);
        System.out.println(Arrays.toString(nums));
    }

    public static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int[] ans = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ans[k++] = arr[i];
            }
        }
//        System.out.println(Arrays.toString(ans));

        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }

    }


}
