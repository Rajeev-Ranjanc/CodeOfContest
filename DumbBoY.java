//https://codeforces.com/group/X1jmHxEVlA/contest/501016/problem/A
//MNNIT Application Club code
import java.util.Scanner;

public class DumbBoY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String balls = scanner.nextLine();

        int ans = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (balls.charAt(i) == 'R') {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }

        System.out.println(ans);
    }
}

