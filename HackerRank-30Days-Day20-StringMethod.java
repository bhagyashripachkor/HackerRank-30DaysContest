import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer tokens = new StringTokenizer(input,"![,?.\'@+] ");
        int count = 0;
        ArrayList<String> array =new ArrayList<String>();
        while(tokens.hasMoreTokens()){
            count++;
            String token = tokens.nextToken();
            array.add(token);
        }
        System.out.println(count);
        for(String item : array){
            System.out.println(item);
        }
    }
}
