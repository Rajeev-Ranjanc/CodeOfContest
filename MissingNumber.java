//https://www.geeksforgeeks.org/problems/in-first-but-second5423/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int n = 5, m = 5;
        long[] a = {4, 3, 5, 9, 11};
        long[] b = {4, 9, 3, 11, 10};
        System.out.println(findMissing(a, b, n, m));
    }

    private static ArrayList<Long> findMissing(long a[], long b[], int n, int m) {
        ArrayList<Long> ans = new ArrayList<>();

        Set<Long> st = new HashSet<>();

        for (int i = 0; i < m; i++) {

            st.add(b[i]);

        }
        for (int i = 0; i < n; i++) {
            if (!st.contains(a[i])) {
                ans.add(a[i]);
            }
        }

        return ans;
    }

}
