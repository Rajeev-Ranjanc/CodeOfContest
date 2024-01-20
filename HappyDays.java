//https://www.codechef.com/practice/course/arrays-java/PJAAR01/problems/RUNCOMPARE?tab=statement
import java.util.Scanner;
public class HappyDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int outer = sc.nextInt ();
        System.out.println ();
        for (int out = 0; out < outer; out++) {
            int size = sc.nextInt ();
            int a[] = new int[size];
            int b[] = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt ();
            }
            for (int i = 0; i < size; i++) {
                b[i] = sc.nextInt ();
            }

            int happy = 0;
            for (int i = 0; i < size; i++) {
                if ((a[i] * 2 < b[i]) || ((b[i] * 2 < a[i]))) {
                    happy++;
                }
            }
            System.out.println ( size - happy );


        }
    }
}