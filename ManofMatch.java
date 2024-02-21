//https://www.codechef.com/START122D/problems/MATCH_ALK
import java.util.Scanner;

public class ManofMatch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int[] a = new int[22];
            int[] b = new int[22];
            int ans = Integer.MIN_VALUE;
            //input the array
            for (int i = 0; i < 22; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            //calculations
            int index = -1;
            for (int i = 0; i < 22; i++) {
                int calc = a[i] + b[i] * 20;
//                ans = Math.max(ans , calc);
                if (calc > ans) {
                    ans = calc;
                    index = i;
                }
            }
            System.out.println(index +1);
        }



    }
}
