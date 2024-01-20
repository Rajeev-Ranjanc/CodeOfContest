//
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int testcase = sc.nextInt ();
        for (int j = 0; j < testcase; j++) {


            int[] coar_x = new int[4];
            int[] coar_y = new int[4];
            for (int i = 0; i < 4; i++) {
                coar_x[i] = sc.nextInt ();
                coar_y[i] = sc.nextInt ();
            }
            long side = 0L;
            if (coar_x[0] != coar_x[1]) {
                side = Math.abs ( coar_x[1] - coar_x[0] );
            } else {
                side = Math.abs ( coar_y[1] - coar_y[0] );
            }
            System.out.println ( side * side );

        }
    }
}
