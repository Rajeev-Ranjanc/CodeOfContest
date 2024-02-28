import java.util.*;

public class TurtleMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int s = 0, ans = 0;
            Map<Integer, Integer> m = new HashMap<>();
            int rmdr = -1, rmdt = -1;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                m.put(a, m.getOrDefault(a, 0) + 1);
                if (a % 3 == 1) {
                    rmdr = a;
                }
                if (a % 3 == 2) {
                    rmdt = a;
                }
                s += Math.abs(a);
            }
            int r = s % 3;
            if (r == 0) {
                ans = 0;
            } else if ((s - rmdr) % 3 == 0 || (s - rmdt) % 3 == 0) {
                ans = 1;
            } else if (r == 1) {
                ans = 2;
            }
            System.out.println(ans);
        }
    }
}
