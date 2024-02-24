//https://www.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/0
//Two numbers of odd occurences in the array
import java.util.*;


public class OddOccur {
    public static void main(String[] args) {
        int N = 42;
        int[] arr = {34, 52, 45, 15, 23, 23, 22, 22, 34, 52, 15, 9, 34, 23, 22, 43, 9, 23, 23, 23, 23, 45, 9, 34, 22, 22, 22, 52, 34, 23, 34, 43, 23, 23, 34, 22, 22, 9, 52, 43, 27, 34};
        System.out.println(Arrays.toString(twoOddNum(arr, N)));
    }

    public static int[] twoOddNum(int Arr[], int N) {
        // code here
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : Arr) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            } else {
                map.put(j, map.get(j) + 1);
            }
        }
        System.out.println(map);
        int k = 0;

        for (Map.Entry<Integer, Integer> val : map.entrySet()) {
            if (val.getValue() % 2 != 0) {
                ans[k++] = val.getKey();
            }
        }
        if(ans[0] < ans[1]){
            int temp = ans[0];
            ans[0]= ans[1];
            ans[1] = temp;
        }
        return ans;
    }
}
