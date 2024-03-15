import java.util.Scanner;

public class OverSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>40){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
