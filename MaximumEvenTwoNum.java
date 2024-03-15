import java.util.HashSet;
import java.util.Set;

public class MaximumEvenTwoNum {
    public static void main(String[] args) {
        int[] a = {4, 6, 8, 12, 14};
        System.out.println(maxEvenTwoSum(a));

    }

    public static int maxEvenTwoSum(int[] A) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        int sum = 0;
        for (int ele : A) {
            if (ele % 2 == 0) {
                sum += ele;
                if (set.contains(ele * 2) || set.contains(ele / 2) || ele == sum) {
                    ans = Math.max(ans, ele);
                }
                set.add(ele);
            }
        }
        return ans;
    }

}
