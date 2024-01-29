//https://codeforces.com/contest/1921/problem/D
/*
this is really a good question
this question can be approached as
first we sort the both array, and we calculate the absolute difference of both
a[i] - b[(m - i - 1)] & a[i] - b[(n - i - 1)] and we consider the maximum value from both
the variable and do sum in a variable & continue
 */
import java.util.Scanner;
import java.util.Arrays;
//Done on codeforces by java 21 version
public class VeryDifferentArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {

            long res = 0;

            int n, m, A, B;

            n = scanner.nextInt();

            m = scanner.nextInt();

            int[] a = new int[n];

            int[] b = new int[m];

            for (int i = 0; i < n; i++) {

                a[i] = scanner.nextInt();

            }
            for (int i = 0; i < m; i++) {

                b[i] = scanner.nextInt();

            }

            Arrays.sort(a);

            Arrays.sort(b);

            for (int i = 0; i < n; i++) {

                A = Math.abs(a[i] - b[(m - i - 1)]);

                B = Math.abs(a[i] - b[(n - i - 1)]);

                res = res + Math.max(A, B);

            }

            System.out.println(res);

        }

    }

}