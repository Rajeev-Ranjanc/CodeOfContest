import java.util.Scanner;
//done on codeforces
public class ArrangingCats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //testcase loop

        int t = sc.nextInt();
        for (int intt = 0; intt < t; intt++) {


            int size = sc.nextInt();

//        sc.nextLine ();
            String s = sc.next();
            String f = sc.next();
            int s_0 = 0;
            int s_1 = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1' && f.charAt(i) == '0') {
                    s_1++;
                } else if (s.charAt(i) == '0' && f.charAt(i) == '1') {
                    s_0++;
                }
            }
            int ans = Math.max(s_0, s_1);
            System.out.println(ans);
            //end testcase loop
        }
    }
}
