/*
just declare two array put even elements into one of them and odd into others and simply again put all elements into the origional array
 */
import java.util.ArrayList;
import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
public class SegerateEven {
    public static void main(String[] args) {
        int N = 7;
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr, N);
        System.out.println(Arrays.toString(arr));
    }

    static void segregateEvenOdd(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        System.out.println(even);
        System.out.println(odd);
        int i = 0, j = 0, k = 0;
        while (i < even.size()) {
            arr[k++] = even.get(i++);
        }

        while (j < odd.size()) {
            arr[k++] = odd.get(j++);
        }
    }
}
