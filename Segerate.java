import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//https://www.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
//amazon paytm linkedin
public class Segerate {
    public static void main(String[] args) {
        int N = 7;
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr, N);
        System.out.println(Arrays.toString(arr));
    }

    private static void segregateEvenOdd(int arr[], int n) {
        // code here
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
//        System.out.println(even);
//        System.out.println(odd);
        //now fills into the origional array
        int i = 0 , j = 0 , k = 0 ;
        while(i<even.size()){
            arr[k++] = even.get(i++);
        }

        while(j<odd.size()){
            arr[k++] = odd.get(j++);
        }
    }
}
