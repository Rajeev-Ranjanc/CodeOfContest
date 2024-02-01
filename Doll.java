//https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/MISSP?tab=statement
/*
Chef and Dolls ->
This problems states that a chef's doll was stolen then find which doll pair was stolen
so I can do it by XOR
 */

import java.util.Scanner;

public class Doll {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {//testcase

            //size
            int size = sc.nextInt();
            int[] a = new int[size];

            //input array elements
            for (int j = 0; j < size; j++) {
                a[j] = sc.nextInt();
            }

            //calculation
            int ans = 0;
            for (int j = 0; j < size; j++) {
                ans = ans ^ a[j];
            }

            System.out.println(ans);
        }//testcase


    }
}
