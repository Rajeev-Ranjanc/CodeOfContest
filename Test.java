//https://www.codechef.com/practice/course/arrays-java/PJAAR01/problems/LARGESECOND?tab=statement
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        int out = sc.nextInt ();
        for (int i = 0; i < out; i++) {
            int size = sc.nextInt ();
            int[] nums = new int[size];
            for (int j=0;j<size;j++){
                nums[j] = sc.nextInt ();
            }
            //array input taken
            System.out.println (maxsum ( nums , size ));
        }


    }
    public static int maxsum(int[] nums , int size){
        int max = nums[0];
        for (int i = 1; i < size; i++) {
            if(max<nums[i]){
                max = nums[i];
            }
        }
        int secmax = 0;
        for (int i = 0; i < size; i++) {
            if(nums[i]<max && nums[i]>secmax){
                secmax = nums[i];
            }
        }
        return max+secmax;
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
        }
        // Your code goes here
 */