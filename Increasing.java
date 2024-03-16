//https://codeforces.com/contest/1742/problem/B


import java.util.Arrays;
import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int size = sc.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(check(a , size));

        }
    }
    public static String check(int[] a , int size){
        Arrays.sort(a);
        for(int i=1;i<size;i++){
            if(a[i-1]>=a[i]){
                return "NO";
            }
        }
        return "YES";
    }
}
