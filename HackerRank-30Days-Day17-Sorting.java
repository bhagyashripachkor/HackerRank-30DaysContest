import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] array = new int[n];
    String inp = sc.nextLine();
    StringTokenizer st = new StringTokenizer(inp," ");
    int k = 0;
    while(st.hasMoreTokens()){
      array[k] = Integer.parseInt(st.nextToken());
      k++;
    }
    
    int temp;
    for (int i = 1; i < array.length; i++) {
        for(int j = i ; j > 0 ; j--){
            if(array[j] < array[j-1]){
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }

   
    StringBuilder sb = new StringBuilder();
    int i = 1;
    
    int difference = Math.abs(array[1] - array[0]);
    
    while(i < n){
  
        int diff = Math.abs(array[i] - array[i-1]);
        
        if(diff == difference)
          sb.append(array[i - 1] + " " + array[i] + " ");
        
         else if(diff < difference) {
         
            sb = new StringBuilder();
            
            sb.append(array[i - 1] + " " + array[i] + " ");
            
            difference = Math.min(diff, difference);
        } 

        i++;
    }

    System.out.println(sb.toString());
  }
}
