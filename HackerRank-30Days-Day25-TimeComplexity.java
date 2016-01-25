import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int x = 0;
        while(x < t){
            int n = Integer.parseInt(sc.nextLine());
            int counter = 0;
            for(int i = 2; i*i <= n; i++)
            {
                if(n%i == 0)
                {
                    counter++;
                    break;
                }
            }
            if(n == 1 || counter != 0)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
            x++;
        }
    }
}
