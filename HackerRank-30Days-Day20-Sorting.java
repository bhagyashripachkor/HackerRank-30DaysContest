import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    ArrayList<Integer> input = new ArrayList<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    String inp = sc.nextLine();
    StringTokenizer st = new StringTokenizer(inp," ");
    int k = 0;
    while(st.hasMoreTokens()){
      input.add(Integer.parseInt(st.nextToken()));
      k++;
    }
    int max_value =Integer.MAX_VALUE;

    Collections.sort(input);
    for (int i=0; i<(n-1) ;i++)
        {
        if( max_value >= (Math.abs(input.get(i)-input.get(i+1))))
            max_value =(Math.abs(input.get(i)-input.get(i+1)));
        }
    for (int i=0; i<(n-1); i++){
        if(max_value ==(Math.abs(input.get(i)-input.get(i+1)))){
            result.add(input.get(i));
            result.add(input.get(i+1));
        }
    }
    for(int item: result){
        System.out.print(item+" ");
    }
  }
}
