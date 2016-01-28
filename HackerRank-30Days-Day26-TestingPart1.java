import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        String[] actual = new String[3];
        String[] expected = new String[3];
        
        int actualDay = 0,actualMonth = 0,actualYear = 0, expectedDay = 0, expectedMonth = 0, expectedYear = 0, fine = 0;
        
        actual = input1.split(" ");
        expected = input2.split(" ");
        
        actualDay = Integer.parseInt(actual[0]);
        actualMonth = Integer.parseInt(actual[1]);
        actualYear = Integer.parseInt(actual[2]);
        
        expectedDay = Integer.parseInt(expected[0]);
        expectedMonth = Integer.parseInt(expected[1]);
        expectedYear = Integer.parseInt(expected[2]);
        
        if(actualYear > expectedYear)
            fine = 10000;
        else if(expectedYear == actualYear && actualMonth > expectedMonth)
            fine = 500 * (actualMonth - expectedMonth);
        else if(expectedYear == actualYear && actualMonth == expectedMonth && actualDay > expectedDay)
            fine = 15 * (actualDay - expectedDay);
        else
            fine = 0;
        System.out.println(fine);
            
        
    }
}
