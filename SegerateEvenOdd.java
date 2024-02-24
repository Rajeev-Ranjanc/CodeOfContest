//https://www.geeksforgeeks.org/problems/even-and-odd/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
//done on gfg
import java.util.Arrays;

public class SegerateEvenOdd {
    public static void main(String[] args) {
        int N = 6;
        int[] nums = {3, 6, 12, 1, 5, 8};
        reArrange(nums, N);
        System.out.println(Arrays.toString(nums));
    }

    private static void reArrange(int[] arr, int N) {
        // code here
        int[] ans = new int[N];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < N; i++) {
            if(arr[i]%2==0){
                ans[even] = arr[i];
                even+=2;
            }
            else{
                ans[odd] = arr[i];
                odd+=2;
            }
        }
        for (int i = 0; i < N; i++) {
            arr[i] = ans[i];
        }
    }
}
