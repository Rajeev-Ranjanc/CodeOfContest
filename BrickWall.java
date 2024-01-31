//This was the first question of Today's (30 jan 2024) contest Div 2
//https://codeforces.com/contest/1918/problem/A
import java.util.Scanner;

public class BrickWall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();

            int A = n * (x / 2);
            System.out.println(A);
        }
    }
}