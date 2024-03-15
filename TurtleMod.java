import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TurtleMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int size = sc.nextInt();
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }//array input
            for (int i = 0; i < size; i++) {
                sum += list.get(i);
            }
            if(sum%3==0){
                System.out.println("NO");
            }
            else{
                int ch = sum%3;
                if(list.contains(ch)){
                    list.remove(ch);
                }
            }
        }
    }
}
