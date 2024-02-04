//https://www.geeksforgeeks.org/problems/multiply-two-strings/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab


/*
Just multiply using BigInteger datatype
 */
import java.math.BigInteger;

public class MultiplyTwoString {
    public static void main(String[] args) {
        String s1 = "0033";
        String s2 = "2";
        System.out.println(multiplyStrings(s1 , s2));
    }

    public static String multiplyStrings(String s1, String s2) {
        //code here.
        BigInteger n1 = new BigInteger(s1);
        BigInteger n2 = new BigInteger(s2);
        BigInteger p = n1.multiply(n2);
        return p.toString();
    }
}
