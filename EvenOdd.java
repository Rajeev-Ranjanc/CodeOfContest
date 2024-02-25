//done on gfg automatically to github
import java.util.ArrayList;
import java.util.Arrays;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, -1, 3, 2, -7, -5, 11, 6 };
       segregateElements(a , n);
        System.out.println(Arrays.toString(a));
    }

    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        for (int i = 0; i <pos.size(); i++) {
            arr[i] =pos.get(i);
        }
        int k =0;
        for (int i = pos.size(); i <n; i++) {
            arr[i] = neg.get(k);
            k++;
        }
    }
}
