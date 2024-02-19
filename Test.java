import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       while (test-->0){
            int[] a = new int[3];
           for (int i = 0; i < 3; i++) {
               a[i] = sc.nextInt();
           }
           Arrays.sort(a);
           int sum = a[2] + a[1];
           if(sum>=10){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
       }
    }
}