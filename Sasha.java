//https://codeforces.com/contest/1929/problem/A
import java.util.Arrays;
import java.util.Scanner;

public class Sasha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            int size = sc.nextInt();
            int[] a = new int[size];
            //input the array
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            //calculation
            Arrays.sort(a);
            int sum = 0 ;
            for (int i = 1; i < size; i++) {
                sum += a[i] - a[i-1];
            }
            System.out.println(sum);

        }
    }
}
