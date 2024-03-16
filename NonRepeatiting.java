//https://www.geeksforgeeks.org/problems/finding-the-numbers0215/1

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatiting {
    public static void main(String[] args) {
        int n = 2;
        int[] arr = {18, 24, 24, 21, 10, 29, 8, 10, 29, 18};
        System.out.println(Arrays.toString(singleNumber(arr)));

    }

    public static int[] singleNumber(int[] nums) {
        //total elements 2*n+2
        //2 are non-repeating 2
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int k = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                ans[k++] = key;
            }
        }

        // Code here
        Arrays.sort(ans);
        return ans;
    }
}
