import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
   int divisorSum(int n);
}
//Write your code here
class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        if (n == 1) {
            return 1;
        }else{
            int sum=1;
            int i = 2;
            while(i <= n/2){
                if(n%i == 0)
                    sum+=i;
                i++;
            }
            return sum + n;
        }
    }
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}
