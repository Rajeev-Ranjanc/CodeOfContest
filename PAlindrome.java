//https://www.geeksforgeeks.org/problems/palindrome-string0817/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
public class PAlindrome {
    public static void main(String[] args) {
        String S = "abba";
        System.out.println(isPalindrome(S));
    }

    static int isPalindrome(String S) {
        // code here

        //brute force approach
//        String ans = "";
//        for (int i = S.length() - 1; i >= 0; i--) {
//            ans = ans + S.charAt(i);
//        }
//
//        if (S.equals(ans)) {
//            return 1;
//        }


        //Another approach would be
        int n = S.length();
        for (int i = 0; i < n; i++) {
            if(S.charAt(i) != S.charAt(n-1-i)){
                return 0;
            }
        }
        return 1;
    }
}
