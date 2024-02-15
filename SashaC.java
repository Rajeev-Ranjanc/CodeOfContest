//https://codeforces.com/contest/1929/problem/C
import java.util.Scanner;

public class SashaC {
    public static long nextBet(long haargyi, long k) {
        return (haargyi + k - 1) / (k - 1);
    }

    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        int t = sx.nextInt();
        while (t-- > 0) {
            long k = sx.nextLong();
            long x = sx.nextLong();
            long a = sx.nextLong();
            long u = 0;
            boolean mils = true;

            for (int i = 0; mils && i < x; i++) {
                long v = nextBet(u, k);
                u += (v == 0) ? 1 : v;
                mils = u <= a;
            }

            if (k * (a - u) > a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}