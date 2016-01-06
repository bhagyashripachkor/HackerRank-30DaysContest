import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
    int test_cases = in.nextInt();
    for (int i = 0; i < test_cases; i++) {
       int a = in.nextInt();
       int b = in.nextInt();
       int N = in.nextInt();
       for (int j=0; j<N; j++){
           int term = a;
           for (int k = j; k >= 0; k--){
               term+=(Math.pow(2,k)*b);
           }
           System.out.print(term+" ");
       }
       System.out.println("");
     }
    }
}
