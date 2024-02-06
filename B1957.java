//contest of the 1957 first question
import java.util.Scanner;

public class B1957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

//        while (t-- > 0) {
        for (int test = 0; test < t; test++) {

            int n = scanner.nextInt(); // Length of the strip
            String s = scanner.next(); // String representing the strip

            int fb = -1;

            int lb = -1;

            // Find the index of the first fb cell
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'B') {
                    fb = i;
                    break;
                }
            }

            // Find the index of the last fb cell
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == 'B') {
                    lb = i;
                    break;
                }
            }

            if (fb == -1) {
                // If there are no fb cells, only one segment of length 1 is needed
                System.out.println(1);
            } else {
                // Length of the segment needed to paint all cells white
                int segmentLength = lb - fb + 1;
                System.out.println(segmentLength);
            }
        }
    }
}
