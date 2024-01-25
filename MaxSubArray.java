//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
//Done on gfg
/*
as we know that when there is subarray or substring of  a length then we can apply sliding window protocol
we can for brute force too
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int N = 4, K = 2;
        ArrayList<Integer> Arr = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400));
        System.out.println(maximumSumSubarray(K, Arr, N));
    }

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        // code here

        //Brute force
        /*
        long max = Integer.MIN_VALUE;
        //brute force
        for (int i = 0; i <= Arr.size()-K; i++) {
            int sum = 0;
            for (int j = i; j < K+i; j++) {
                sum+=Arr.get(j);
            }
            max = Math.max(sum , max);
        }
        return  max;

         */
//Optimal Solution using sliding window algorithm
//        window size = end -start+1;
        int start = 0;
        int end = 0;
        long sum = 0;
        long max = Long.MIN_VALUE;
        while (end < Arr.size()) {
            sum += Arr.get(end);
            if (end - start + 1 < K) {
                end++;
            } else if (end - start + 1 == K) {
                max= Math.max(sum , max);
                sum=sum-Arr.get(start);
                start++;
                end++;
            }

        }
        return max;
    }
}
