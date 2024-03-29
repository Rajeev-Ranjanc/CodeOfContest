import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
/*
First non negative number in a window size K
//brute Force i can approach
 */
public class FirstNegaitveWindowK {
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(Arrays.toString(printFirstNegativeInteger(nums, n, k)));
    }

    public static long[] printFirstNegativeInteger(int[] nums, int size, int k) {

        /*
        //brute force would be
        long[] ans = new long[size - k + 1];
//       ans= new long[]{0};

        for (int i = 0; i < size - k; i++) {
            for (int j = i; j <=k + i; j++) {
                if (nums[j] < 0) {
                    ans[i] = nums[j];
                    break;
                }
            }
        }
        return ans;
         */

        int i = 0;
        int j = 0;
        int index = 0;
        long[] ans = new long[size - k + 1];
        Queue<Integer> q = new LinkedList<>();
        while (j<size){

            //adding negative elements in the queue
            if(nums[j]<0){
                q.add(nums[j]);
            }
            if(j-i+1<k){
                j++;
            }
            if(j-i+1==k){
                if(q.isEmpty()){
                    ans[index] = 0;
                    index++;
                }
                else{
                    int number = q.peek();
                    ans[index] = number;
                    index++;
                    if(number==nums[i]){
                        q.remove();
                    }
                }
                i++;
            }
            j++;
        }
        return ans;

    }
}
