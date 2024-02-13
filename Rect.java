//kinly push onto github
import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            System.out.println(Cut(h, w));
            ;
        }
    }

    public static String Cut(int a, int b) {
        // Check if the original rectangle dimensions allow for cutting and forming another rectangle
        // Here, we simply check if the area of the original rectangle is even, as that ensures we can cut it into two equal halves.
        if(a % 2 != 0 && b % 2 != 0 || a % 2 != 0 && b / 2 == a || b % 2 != 0 && a / 2 == b){
            return "NO";

        }
        return "YES";
    }
}
