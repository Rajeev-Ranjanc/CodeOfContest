//https://codeforces.com/contest/1933/problem/A
import java.util.Scanner;

public class MaXum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int size = sc.nextInt();
            int[] a = new int[size];

            //input
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            //sum
            for (int i = 0; i < size; i++) {
                sum +=Math.abs(a[i]);
            }

            System.out.println(sum);
        }
    }
}
