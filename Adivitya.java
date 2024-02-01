//https://www.codechef.com/START119D/problems/ADVITIYA1
/*
In this problem there are a group of friends & three of them are in some iit and their iit conducting
some fest on 17 , 18 , 19 of feb and one of them is not present there & that friend gonna be there if that one guy
can go their & can join then i have to print "ADVITIYA" if he can't be there simply prints "WAITING FOR ADVITIYA"
 */
import java.util.*;
import java.lang.*;

class Adivitya

{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n== 16 || n == 17 || n == 18){
            System.out.println("ADVITIYA");
        }
        else{
            System.out.println("WAITING FOR ADVITIYA");
        }
    }
}
