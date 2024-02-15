//https://codeforces.com/contest/1929/problem/B
import java.util.Scanner;

public class SashaB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;
            if ((4 * n) - 2 == k) {
                ans = (int)Math.ceil(k / 2.0) + 1;
            } else {
                ans = (int)Math.ceil(k / 2.0);
            }
            System.out.println(ans);
        }

    }
}
