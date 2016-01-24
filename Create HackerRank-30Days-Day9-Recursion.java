import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Take Input
        String input = sc.nextLine();
        String[] inp = input.split(" ");
        int a = Integer.parseInt(inp[0]);
        int b = Integer.parseInt(inp[1]);
        int gcd=find_gcd(a,b);
        System.out.println(gcd);
    }
   static  int find_gcd(int a,int b){
          //Write the base condition
       if(b == 0)
           return a;
       else if(a == 0)
           return b;
       else{
           return find_gcd(b,a%b);
       }
          
      }
}
