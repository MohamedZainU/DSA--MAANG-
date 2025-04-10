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
    public static Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        
        Node prev = head;
        head = head.next;
        prev.next = null;
        head.back = null;
        
        return head;
    } 
    
    public static Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node prev = temp.back;
        temp.back = null;
        prev.next = null;
        return head;
    }
    
    public static Node deleteKthNode(Node head,int k){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt==k){
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev==null){
            return deleteHead(head);
        }else if(front==null){
            return deleteTail(head);
        }else{
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }
        return head;
    }
    public static Node deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;
        
        if(front==null){
            prev.next = null;
            temp.back = null;
            return temp;
        }
        prev.next = front;
        front.back = prev;
        temp.back = null;
        temp.next = null;
        return temp;
    }
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
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		Node head = convertToArrayDoubly(arr);
		head = deleteHead(head);
		head = deleteTail(head);
		head = deleteKthNode(head,4);
		deleteNode(head.next);
		Node temp = head;
			while(temp!=null){
		    System.out.println(temp.data);
		    temp = temp.next;
		}
	}
}