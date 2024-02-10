import java.util.Scanner;

public class BlindGate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int b = fn(n, a);
        System.out.println(b);
    }

    public static int fn(int n, int[] tokens) {
        int l = 0;
        for (int i = 0; i < n; i++) {
            l ^= tokens[i];
        }
        return l;
    }
}
