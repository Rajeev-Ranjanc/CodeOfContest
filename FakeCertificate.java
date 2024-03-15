import java.util.Scanner;

public class FakeCertificate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int one = 0, zero = 0, curZero = 0;
            String s = scanner.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    one++;
                    curZero = 0;
                } else {
                    curZero++;
                    zero = Math.max(curZero, zero);
                }
            }
            System.out.println(zero + one);
        }

    }
}
