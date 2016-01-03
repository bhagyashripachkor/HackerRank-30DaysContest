import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      double tip = (M * T)/100;
      double tax = (M * X)/100;
        
      // Enter your code here!
      // Run some computations....
       double fina = tip + tax + M;
      
       int total = (int) Math.round(fina);
       System.out.println("The final price of the meal is $"+total+".");
      // ...then print!
      
    }
}
