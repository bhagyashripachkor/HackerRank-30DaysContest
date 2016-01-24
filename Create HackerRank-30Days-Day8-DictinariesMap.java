//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh) { 
    Scanner in = new Scanner(System.in); 
    Integer n = Integer.parseInt(in.nextLine());
    // specify type mapping 
    HashMap<String,String> phoneBook 
        = new HashMap<String,String>();
    for(int i=0;i < n; i++){
        // read line with name
        String name = in.nextLine();
        String phone =in.nextLine();
        phoneBook.put(name, phone);
        // read line with number
        // add to hashmap
    }   
    while(in.hasNext()) { 
        String queryKey=in.nextLine();
        String queryValue = phoneBook.get(queryKey);
        if(queryValue != null){
            System.out.println(
                queryKey + "=" + queryValue);
            }      
            else { 
                System.out.println("Not found"); 
            } 
    }
}
}
