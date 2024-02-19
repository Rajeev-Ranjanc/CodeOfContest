/*
CC club mnnit allahabad classes
 */
import java.util.Scanner;

public class CC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(Math.pow(a, b));
        //using for loop
//        long ans = 1;
//        for (int i = 1; i <= b; i++) {
//            ans = ans * a;
//        }
//        System.out.println(ans);

        //using loop
//        while (b-->0){
//            ans = ans * a;
//        }
//        System.out.println("ans:"+ans);
//        System.out.println(powerfun(2, 4));
//        System.out.println(poweroptimal(2, 7));

//        System.out.println(poweredge(36 , 51));

//        double m = 1e9 + 7;
//        System.out.println(sum(5, m));
//        poweriterate();
        modwithoutmod();
    }

    //using recursion implementing power function of the mathematics
    public static int powerfun(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * powerfun(a, b - 1);
    }

    //dividing b every time by 2 ->Binary Exponentiation
    public static int poweroptimal(int a, int b) {
        /*
        here we are  doing half
         */
        int ans = 1;

        if (b == 0) {
            return 1;
        }

        ans = poweroptimal(a, b / 2);
        ans *= ans;

        if (b % 2 != 0) {
            ans *= a;
        }
        return ans;
    }

    //edge cases ->a^b%m
    //36 ^ 51 % 10e9+7 = 569440039
    public static long poweredge(int a, int b) {
//        double a =Math.pow(10, 5);
//        double b = Math.pow(10, 9);
//        double m = 1e9+7;//10^9 + 7 that is m

//        double m = 1e9+7;//10^9 + 7 that is m
        long m = (long) (1e9 + 7);//10^9 + 7 that is m // not working
//        double result = ((a%m) + (b%m))%m;
//        System.out.println(result);
        long result = 1;

        if (b == 0) {
            return 1;
        }

        result = poweroptimal(a, b / 2);
        result = (((result % m) * (result % m)) % m);

        if (b % 2 != 0) {
            result *= a;
        }
        return result;

    }

    public static double sum(int n, double m) {

        Scanner sc = new Scanner(System.in);

        //n is the size of the array
        //m is the modulus
        int[] nums = new int[n];

        //input the array
        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt() ;
            nums[i] = sc.nextInt();
        }

        //calculations
        //if array is less than m then we can remove the %m which is inside the bracket
        double ans = 1;
        for (int i = 0; i < n; i++) {
//            ans = (ans %m + nums[i] % m) % m;

            ans = (ans + nums[i] % m) % m;
        }
        return ans;

    }

    //binary exponentiation iteratively
    public static void poweriterate() {
        int a = 2;
        int b = 9;
        int result = 1;
        while (b > 0) {
//           result = result*a;
//           if(b%2==1){
//               result = result*a;
//               b = b/2;
//           }
            if (b % 2 == 0) {
                a = a * a;
                b/=2;
            }
            else{
                result*= a;
                b = b-1;
            }
        }
        System.out.println(result);
    }
    public static void modwithoutmod(){
       int a = 13;
       int b = 2;
       int ans = a - (a/b)*b;
        System.out.println(ans);
    }
}
