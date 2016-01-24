import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int x = 0;
        while(x != n){
            int number = Integer.parseInt(sc.nextLine());
            int binary[] = new int[32];
            int index = 0;
            while(number > 0){
                binary[index++] = number%2;
                number = number/2;
            }
            for(int i = index-1;i >= 0;i--){
                System.out.print(binary[i]);
            }
           System.out.println(); 
            x++;
        }
    }
}
