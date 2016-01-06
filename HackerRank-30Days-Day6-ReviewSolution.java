import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int i, j, spaces = n, spaceCount;
 
        for (i = 1; i <= n; i++) {
            for (spaceCount = spaces-1; spaceCount >= 1; spaceCount--) {
                System.out.print(" ");
            }
 
        for (j = 1; j <= i; j++) {
         System.out.print("#");
        }
 
      System.out.println();
      spaces--;
        }
    }
}
