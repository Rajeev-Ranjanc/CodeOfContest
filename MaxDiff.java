//https://www.codechef.com/practice/course/greedy-algorithms/INTGRA01/problems/MAXDIFF?tab=statement
//please push it on github
import java.util.Arrays;
import java.util.Scanner;

public class MaxDiff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {

            int size = sc.nextInt();

            int k = sc.nextInt();

            int[] a = new int[size];

            //getting input array
            for (int j = 0; j < size; j++) {
                a[j] = sc.nextInt();
            }
            //took input of the array elements
            Arrays.sort(a);
            int g = Math.min(k , size -k);
            int beta = 0;
            for (int j = 0; j < g; j++) {
                beta+=a[j];
            }//beta ka calculation

            int baap = 0;
            for (int j = g; j < size; j++) {
                baap += a[j];
            }

            System.out.println(baap - beta);
        }
    }
}
