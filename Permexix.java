
//https://www.codechef.com/practice/course/greedy-algorithms/INTGRA01/problems/PERMEXIS
//kindly push onto github
import java.util.Scanner;

public class Permexix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();

            //array
            int[] a = new int[size];

            for (int j = 0; j < size; j++) {
                a[j] = sc.nextInt();
            }//getting array input

            int count = 0;
            for (int j = 1; j < size; j++) {
                if(Math.abs(a[j-1] - a[j] ) <= 1){
                    count++;
                }
            }
            if(count == size-1){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }

}
