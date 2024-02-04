//Done on gfg
//I had to reverse the string
/*
I have simply defined a String var and reverse loop of and added to that variable oen by one
 */
import java.lang.String;
public class Reverse {
    public static void main(String[] args) {
        String str = "For";
        System.out.println(reverseWord(str));
    }
    public static String reverseWord(String str)
    {
        int n = str.length()-1;
        // Reverse the string str
        String name ="";
        for(int i=n;i>=0;i--){
            name= name + str.charAt(i);
        }
        return name;
    }

}
