import java.util.Scanner;
public class InsertDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int n = sc.nextInt ();
        int[] om = new int[n];
        int[] addy = new int[n];

        //Array input for the om's streak
        for (int i = 0; i < n; i++) {
            om[i] = sc.nextInt ();
        }

        //array input for the addy's work
        for (int i = 0; i < n; i++) {
            addy[i] = sc.nextInt ();
        }



    }
}
