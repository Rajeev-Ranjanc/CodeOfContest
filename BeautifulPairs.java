//its given TLE while submitting on the codeforces
import java.util.*;

public class BeautifulPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Map<Pair, Integer> mp = new HashMap<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int p = arr[i] % x;
                int q = arr[i] % y;
                Pair pair = new Pair(p, q);
                ans += mp.getOrDefault(pair, 0);
                if (p == 0) {
                    p = x;
                }
                mp.put(pair, mp.getOrDefault(pair, 0) + 1);
            }
            System.out.println(ans);
        }
    }

    static class Pair {
        int x;
        int y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return x == pair.x && y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
