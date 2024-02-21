//https://www.codechef.com/START122D/problems/PBREV
import java.util.Scanner;

public class ProblemReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int size = sc.nextInt();
            int[] a = new int[size];
            //input the array
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }//array input

            int cout = 0;
            for (int i = 0; i < size; i++) {
                if (a[i] > 4) {
                    cout++;
                }
            }
            if(cout == size){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
