//https://codeforces.com/group/X1jmHxEVlA/contest/501016/problem/B
//MNNIT Application club
import java.util.Arrays;
import java.util.Scanner;

public class Allocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] btec = new int[size1];
        for (int i = 0; i < size1; i++) {
            btec[i] = sc.nextInt();
        }
        Arrays.sort(btec);

        int size2 = sc.nextInt();
        int[] mca = new int[size2];
        for (int i = 0; i < size2; i++) {
            mca[i] = sc.nextInt();
        }
        Arrays.sort(mca);
        int count = 0;
        for (int i = 0; i < size1; i++) {
            if(Math.abs(btec[i]-mca[i])<2){
                count++;
            }
        }

        System.out.println(count);
    }
}
