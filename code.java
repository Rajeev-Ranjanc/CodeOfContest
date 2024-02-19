import java.util.Scanner;

public class code {
    // Function to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(gcd(x, y));
        }
    }
}