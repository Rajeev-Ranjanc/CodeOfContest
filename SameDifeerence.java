// https://codeforces.com/problemset/problem/1921/D

//4 6
//        6 1 2 4
//        3 5 1 7 2 3


import java.util.*;

/*
if we sort the first array in ascending order and second array in descending order and i f we try to calculate the
absolute sum of start element of the first array and second array and same as the last elements of the first and second
array then we will get the maximum difference
 */
public class SameDifeerence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {


            //input the size of first array
            int n = sc.nextInt();
            //input the size of thr second array
            int m = sc.nextInt();
            //initialising the first array
            int[] first = new int[n];
            //initialising the second array
            int[] second = new int[m];
            //taking first array input
            for (int i = 0; i < n; i++) {
                first[i] = sc.nextInt();
            }
            //second array
            for (int i = 0; i < m; i++) {
                second[i] = sc.nextInt();
            }

            //sort first array by ascending order
            Arrays.sort(first);

            //sort second array by descending order
            InsertionSort(second);
            System.out.println(differentarray(first, n, second, m));


        } //testcase

    }

    public static int differentarray(int[] first, int n, int[] second, int m) {
        int start = 0;

        int firend = n-1;
        int secend = m-1;
        int sum = 0;
        while (start<=firend){
            sum+=(Math.abs(first[start] - second[start]));
            sum+= (Math.abs(first[firend] - second[secend]));
            start++;
            firend--;
            secend--;
        }

        return sum;


    }

    public static void InsertionSort(int[] nums) {
//        for (int i = 0; i <= n-2; i++) {
        //i will goes until n-2 bcz j is going till i+1
        //if i will till n-1 the j will go upto n which is array out of the bond
        int n = nums.length;
        for (int i = 0; i <= n - 2; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (nums[j] > nums[j - 1]) {

                    swap(nums, j, j - 1);

                } else {

                    break;

                }
            }
        }
    }

    public static void swap(int[] nunms, int firstIndex, int SecondIndex) {
        int temp = nunms[firstIndex];
        nunms[firstIndex] = nunms[SecondIndex];
        nunms[SecondIndex] = temp;
    }


}