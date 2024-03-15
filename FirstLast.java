import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FirstLast {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 5};
        int k = 1;
        ArrayList<Integer> a = new ArrayList<>();
        for (int j : arr) {
            a.add(j);
        }
        System.out.println(Arrays.toString(firstAndLastPosition(a, a.size(), k)));
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
//        int first = -1, last = -1;
//        for (int i = 0; i < n; i++) {
//            if (arr.get(i) == k) {
//                if (first == -1)
//                    first = i;
//                last = i;
//            }
//        }
//        return new int[]{first, last};
        int[] ans = {-1, -1};
        ans[0] = search(arr, k, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, k, false);
        }

        return ans;

    }

    public static int search(ArrayList<Integer> arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr.get(mid)) {
                end = mid - 1;
            } else if (target > arr.get(mid)) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }
        return ans;
    }
}
