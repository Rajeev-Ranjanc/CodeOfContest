//https://www.codingninjas.com/studio/problems/square-root-integral_893351?leftPanelTab=0%3Futm_source%3Dstriver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=PROBLEM
import java.util.Scanner;
/*
Using Binary search
 */
public class SquareRootOfaNumber {
    public static void main(String[] args) {
        int n =36;
        System.out.println(sqrtN(n));

    }
    public static int sqrtN(long N) {
        /*
         * Write your code here
         */
        long start = 1;
        long end = N;
        while(start<=end){

            long mid = start +(end-start)/2;

            long val = mid * mid;

            if(val<=N){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return (int)end;
    }

}
