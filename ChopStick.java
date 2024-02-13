//https://www.codechef.com/practice/course/greedy-algorithms/INTGRA01/problems/TACHSTCK?tab=statement
import java.util.*;
import java.lang.*;

class ChopStick
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i<n-1; i++){
            if(a[i+1]-a[i]<=k){
                ans++;
                i++;
            }
        }
        System.out.println(ans);
    }
}