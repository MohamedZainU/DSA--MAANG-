/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Node{
    int data;
    Node nxt;
    
    Node(int data,Node nxt){
        this.data = data;
        this.nxt = nxt;
    }
    
    Node(int data){
        this.data = data;
        this.nxt = null;
    }
}
public class Main
{
    public static int lengthOfLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            //System.out.println(temp.data);
            temp = temp.nxt;
            cnt++;
        }
        return cnt;
    }
    public static Node convertArray(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.nxt = temp;
            mover = temp;
        }
        return head;
    }
    
    public static Node removeHead(Node head){
        if(head == null) return head;
        Node temp = head;
        head = head.nxt;
        return head;
    }
    
    public static Node removePos(Node head,int k){
        int cnt =0;
        if(head == null) return head;
        if(k==1){
            Node temp = head;
            head = head.nxt;
        }else{
        Node temp = head;
        Node prev = null;
        while(temp != null){
            cnt++;
            if(cnt==k){
                prev.nxt = prev.nxt.nxt;
            }
            prev = temp;
            temp = temp.nxt;
        }
        }
        return head;
    }
    
    
    public static Node removeVal(Node head,int ele){
        if(head == null) return head;
        if(head.data == ele){
            Node temp = head;
            head = head.nxt;
        }else{
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == ele){
                prev.nxt = prev.nxt.nxt;
            }
            prev = temp;
            temp = temp.nxt;
        }
        }
        return head;
    }
    
    
    public static Node removeTail(Node head){
        if(head == null || head.nxt == null) {
            return null;
        }
        Node temp = head;
        while(temp.nxt.nxt != null){
            temp = temp.nxt;
        }
        temp.nxt = null;
        return head;
    }
    
    public static Node insertAtHead(Node head,int val){
        if(head==null) return head;
        Node temp = new Node(val);
        temp.nxt = head;
        return temp;
    }
    
    public static Node insertAtTail(Node head,int val){
        Node temp = head;
        Node newNode = new Node(val);
        while(temp.nxt != null){
            temp = temp.nxt;
        }
        temp.nxt = newNode;
        return head;
    }
    
    public static Node insertPosition(Node head,int ele,int k){
        if(head==null){
            if(k==1){
                return new Node(ele);
            }else{
                return head;
            }
        }
        if(k==1){
            Node addHead = new Node(ele,head);
            return addHead;
        }
        int cnt = 0;
        Node temp = head;
        while(temp != null){
            cnt++;
            if(cnt==k-1){
                Node newOne = new Node(ele,temp.nxt);
                temp.nxt = newOne;
                break;
            }
            temp = temp.nxt;
        }
        return head;
    }
    
    public static boolean searchOfElement(Node head,int target){
        Node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            temp = temp.nxt;
        }
        return false;
    }
	public static void main(String[] args) {
	    int arr[] = {2, 3, 7, 10, 11, 11, 25};
	    Node n = convertArray(arr);
	   System.out.println(lengthOfLL(n));
	   if(searchOfElement(n,26)){
	       System.out.println("true");
	   }else{
	       System.out.println("false");
	   }
	    //n = removeHead(n);
	    //n = removeTail(n);
	    //n = removePos(n,3);
	    n = removeVal(n,arr[5]);
	    n = insertAtHead(n,6);
	    n = insertAtTail(n,34);
	    n = insertPosition(n,100,8);
	    Node temp = n;
	    while(temp !=null){
	        System.out.println(temp.data);
	        temp = temp.nxt;
	    }
	}
}