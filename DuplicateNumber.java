//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a = {3 ,4 ,12, 3, 12, 3, 4, 4 ,12 ,7, 11, 6, 5};
        int n = a.length;

        System.out.println(duplicates(a , n));
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        /*
           this question is asking the elements which is duplicates in the array
         */
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i != arr[i]){
                ans.add(arr[i]);
            }
        }
        if(ans.isEmpty()){
           ans.add(-1);
        }
        return ans;

    }
}
