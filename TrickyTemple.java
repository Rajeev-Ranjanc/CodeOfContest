import java.util.Scanner;
//Done on codeforces
//https://codeforces.com/contest/1922/problem/A
public class TrickyTemple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int x = 0; x < test; x++) {

            int size = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();

            System.out.println(TrikyTemplate(size , a, b , c));
        }
    }
    public static String TrikyTemplate(int size , String a , String b , String c){
        for (int i = 0; i < size; i++) {
            if (a.charAt(i) != c.charAt(i) && b.charAt(i) != c.charAt(i)) {
                return "YES";
            }
        }
        return "NO";
    }

}