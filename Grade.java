import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            int grade = sc.nextInt();
            int marks = sc.nextInt();

            if(grade<50){
                System.out.println("Z");
            } else if (marks<50 && grade>=50) {
                System.out.println("F");
            }
            else{
                System.out.println("A");
            }
        }
    }
}
