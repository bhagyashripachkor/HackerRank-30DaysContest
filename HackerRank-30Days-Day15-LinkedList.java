import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
public static  Node insert(Node head,int data)
	{
  	//Complete this method
        if(head == null){
      Node newNode = new Node(data);
      head = newNode;
      return head;
  }else{
      Node newNode = head;
      Node n = new Node(data);
      while(newNode.next != null){
          newNode = newNode.next;
      }
      newNode.next = n;
      return head;
  }
	}
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int N=sc.nextInt();
          while(N-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }
}
