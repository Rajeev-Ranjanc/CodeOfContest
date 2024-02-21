//https://www.codechef.com/START122D/problems/HEALSE
import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 8){
            System.out.println("PERFECT");
        } else if (n<8) {
            System.out.println("LESS");
        }
        else{
            System.out.println("MORE");
        }
    }
}
