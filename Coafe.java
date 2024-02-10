import java.util.Scanner;
import java.util.TreeMap;

public class Coafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeMap<Integer, Integer> mp = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int time = h * 60 + m;
            mp.put(time, mp.getOrDefault(time, 0) + 1);
        }

        int bhnkal = 0;
        for (int count : mp.values()) {
            bhnkal = Math.max(bhnkal, count);
        }

        System.out.println(bhnkal);
    }
}