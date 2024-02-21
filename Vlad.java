import java.util.Scanner;

public class Vlad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            String str = sc.next();
            int ca = 0;
            int cb = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='A'){
                    ca++;
                }
                else{
                    cb++;
                }
            }

            if(ca>cb){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
    }
}
