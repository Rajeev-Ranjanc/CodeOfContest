import java.util.Scanner;

//https://www.hackerrank.com/contests/ac-opc-1/challenges/jealous-girlfriend
/*
Today is Valentine's Day. Sachin and Shubman went to a flower shop to buy roses for their
girlfriends, Seema and Sara. The shop has only two kinds of roses:
 red and white. The weight of a red rose is 1 gram, and a white rose
 weighs 2 grams. Now, Seema and Sara are very good friends. Last year,
 Sachin gifted more gifts than Shubman to Seema. Sara gots to know this thing
 from Seema, and she got upset from Shubman. They don't want this to happen again this year.

So, help them divide all the roses among themselves fairly so that the total weight
 of Sachin's girlfriend's roses is equal to the total weight
  of Shubman's girlfriend's roses. If they able to do so then
   Seema and Sara becomes Happy :)

 */
/*
we can do it by if we count no of 1 if its even number of time but not zero then "yes" they can divide between them
if number of 1 ans number of 2 is also even then we can do it
 */
public class Jealous_girlfriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        int size = sc.nextInt();
        //roses are to be taken input
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = sc.nextInt();
        }
        //took input
        int count_1 = 0;
        int count_2 = 0;
        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }

        //condition
        //logic

        if(count_1%2!=0){
            System.out.println("NO");
        }
        else {
            if(count_1==0 && count_2%2!=0){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }

        }
    }

}
