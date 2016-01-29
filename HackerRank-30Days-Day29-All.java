import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int flag = 0, diff1 = 0,diff2 = 0;
        while(t > 0) {
            String input = sc.nextLine();
            String rev = "";
            int x = input.length() - 1;
            while(x >= 0){
                rev = rev + input.charAt(x);
                x--;
            }
            for( int i = input.length() - 1; i >= 1; i--){
                diff1 = (int)input.charAt(i) - (int)input.charAt(i-1);
                diff2 = (int)rev.charAt(i) - (int)rev.charAt(i-1);
                if(Math.abs(diff1) != Math.abs(diff2)) {
                    flag = 1;
                    System.out.println("Not Funny");
                    break;
                }
            }
                if(flag == 0)
                    System.out.println("Funny");
            t--;
            }
        
    }
}
