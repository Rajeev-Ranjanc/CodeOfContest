//
import java.util.Arrays;

public class EvenOddPlace {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {0, 0, 1, 1, 0};
        segregate0and1(nums, n);
        System.out.println(Arrays.toString(nums));
    }

    public static void segregate0and1(int[] arr, int n) {
        // code here
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zero++;
            }
        }

        //f
        Arrays.fill(arr , 1);
        for (int i = 0; i <zero; i++) {
            arr[i] = 0;
        }
    }


}
