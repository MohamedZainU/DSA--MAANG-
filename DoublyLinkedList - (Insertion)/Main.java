/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Node{
    Node next;
    int data;
    Node back;
    
    public Node(int data1,Node next1,Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}
public class Main
{
     public static Node convertToArrayDoubly(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    
    public static Node insertBeforeTail(Node head,int val){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        Node newTail = new Node(val,temp.next,temp);
        temp.next = newTail;
        return head;
    }
    
    public static void insertBeforeNode(Node temp,int val){
        Node prev = temp.back;
        Node newNode = new Node(val,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
    }
    
    public static Node insertBeforeHead(Node head,int val){
      if(head==null || head.next==null){
        return null;
      }
      Node newHead = new Node(val,head,null);
      head.back = newHead;
      return newHead;
    }
    
    public static Node insertBeforeK(Node head,int k,int val){
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        if(prev==null){
            return insertBeforeHead(head,val);
        }else{
            
            Node newK = new Node(val,temp,prev);
            prev.next = newK;
            temp.back = newK;
            return head;
        }
    }
    
    
    public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Node head = convertToArrayDoubly(arr);
		head = insertBeforeHead(head,212);
		head = insertBeforeTail(head,213);
		head = insertBeforeK(head,6,217);
		insertBeforeNode(head.next.next.next.next,78);
		Node temp = head;
			while(temp!=null){
		    System.out.println(temp.data);
		    temp = temp.next;
	}
	
	
  }
}