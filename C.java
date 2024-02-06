//Codeforces contest 1957
import java.util.HashMap;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            mp1.put(a, mp1.getOrDefault(a, 0) + 1);
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            mp2.put(a, mp2.getOrDefault(a, 0) + 1);
        }

        int c1 = 0, c2 = 0;
        int flag = 0;

        for (int i = 1; i <= k; i++) {
            flag = 0;
            if (mp1.containsKey(i)) {
                flag = 1;
                c1++;
            }
            if (mp2.containsKey(i)) {
                flag = 1;
                c2++;
            }
            if (flag == 0) {
                System.out.println("NO");
                return;
            }
        }

        if (c1 >= k / 2 && c2 >= k / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}