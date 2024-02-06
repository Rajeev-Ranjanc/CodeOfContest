//https://www.codechef.com/practice/course/greedy-algorithms/INTGRA01/problems/XYSTR
//kindly push onto github

import java.util.Scanner;

public class ChecfString {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int c = 0;
            for (int i = 1; i < s.length(); i++) {

                if ((s.charAt(i) == 'x' && s.charAt(i - 1) == 'y') || (s.charAt(i) == 'y' && s.charAt(i - 1) == 'x')) {
                    c++;
                    i++;
                }
            }
            System.out.println(c);
        }
    }
}
