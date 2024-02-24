//https://www.geeksforgeeks.org/problems/maximum-xor-of-two-numbers-in-an-array/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
public class MaximumXor {
    public static void main(String[] args) {
        int[] Arr = {25, 10, 2, 8, 5, 3};
        System.out.println(max_xor(Arr , Arr.length));
    }

    public static int max_xor(int arr[], int n) {
        //code here
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j =i+1; j < n; j++) {

                int xor =arr[i] ^ arr[j];
                max = Math.max(xor, max);
            }

        }
        return max;
    }
}
