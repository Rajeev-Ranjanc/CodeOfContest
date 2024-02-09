//https://www.codechef.com/START119D/problems/ADVITIYA2
/*
It was a simple problem if we found number of 1 more than equal to 4 then ans is "YES" otherwise "NO"
Question is about there is a participant who performs and there are 5 judge who will judge the
performance of the performer & will allow to meet him if he is satisfied then will give 1 as output otherwise 0
 and I will count 1 simply
 */
import java.util.*;
import java.lang.*;

class Adivita {
    public static void main(String[] args)  {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int j : a) {
            if (j == 1) {
                count++;
            }
        }
        if (count >= 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
