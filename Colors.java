//https://www.codechef.com/practice/course/arrays-strings-sorting/INTARR01/problems/DISTINCTCOL?tab=statement
//Codechef
//done on codechef
import java.util.Scanner;
public class Colors {
    public static void main(String[] args) {
/*
3
2
8 5
3
5 10 15
4
4 4 4 4
 */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int size = sc.nextInt();
            int[] a= new int[size];

            for (int j=0;j<size;j++){
                a[j] = sc.nextInt();
            }

            //calculation
            int ans = a[0] ;
            for (int j=1;j<size;j++){
                if(ans<a[j]){
                    ans = a[j];
                }
            }

            System.out.println(ans);
        }//testcases

    }
}
