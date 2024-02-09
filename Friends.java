//https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/CFRTEST?tab=statement
import java.util.*;
import java.lang.*;

class Friends {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int cont = 0;
            int size = sc.nextInt();
            int[] a = new int[size];
            //input the array
            for (int i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }//array input

            Arrays.sort(a);

            for (int i = 1; i < size; i++) {
                if(a[i-1] !=a[i]){
                    cont++;
                }
            }
            System.out.println(cont+1);

        }//testcases
    }
}
