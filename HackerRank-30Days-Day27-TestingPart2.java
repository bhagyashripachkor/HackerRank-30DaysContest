import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int x = 0;
        while(t < x){
            String[] line1 = sc.nextLine().split(" ");
            int std = Integer.parseInt(line1[0]);
            int thres = Integer.parseInt(line1[1]);
            String[] line2 = sc.nextLine().split(" ");
            int j = 0;
            int count = 0;
            for(int i = 0; i < std; i++){
                j = Integer.parseInt(line2[i]);
                if(j <= 0)
                    count++;
                else if(j == 0)
                    count++;
            }
            if(count >= thres)
                System.out.println("NO");
            else
                System.out.println("YES");
            x++;
            
        }
    }
}
