//https://codeforces.com/contest/1742/problem/A
import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a ==b+c) || (b == a+c) || (c == a+b)){
                System.out.println("YES");
            }
            else{
                System.out.println("No");
            }
        }

    }

}
