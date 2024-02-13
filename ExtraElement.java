//kindly push it onto
import java.util.HashSet;
import java.util.Set;

public class ExtraElement {
    public static void main(String[] args) {
        int n = 4;
        int[] a = {1,2,3,4};
        int[] b = {1,2,3};
        System.out.println(findExtra(a, b, n));
    }

    public static int findExtra(int[] a, int[] b, int n) {
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            st.add(a[i]);
        }

        for (int i = 0; i < st.size(); i++) {
            if(!st.contains(b[i])){
                return i;
            }
        }
        return -1;
    }

}
