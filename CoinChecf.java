import java.util.*;
import java.lang.*;
import java.io.*;

public class CoinChecf
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int i =1;
            int count= 0;
            int n = sc.nextInt();
            while (n>0){
                n = n-i;
                count++;
                i++;
            }
            System.out.println(count-1);
        }

    }
}
