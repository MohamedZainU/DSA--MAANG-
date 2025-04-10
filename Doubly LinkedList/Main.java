/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class DLL{
    private Node head;
    
    
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head!=null){
            head.prev = node;
            
        }
        
            node.next = head;
            node.prev = null;
            head = node;
    }
    
    public void insertAfter(int after,int val){
        Node node = new Node(val);
        Node p = find(after);
        if(p==null){
            System.out.println("Does not exist !");
            return;
        }
        
        node.prev = p;
        node.next = p.next;
        p.next = node;
        
        if(node.next.prev != null){
            node.next.prev = node;
        }
    }
    
    
    public Node find(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    
    public void insertLast(int val){
        Node node = new Node(val);
        
        if(head==null){
            node.prev = null;
            head = node;
            return;
        }
        Node last = head;
        while(last.next==null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
    }
    
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        
        System.out.println("Reversal: ");
        
        while(last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
        System.out.println("Start");
    }
    
    private class Node{
        int val;
        Node next;
        Node prev;
        
        public Node(int val){
            this.val = val;
        }
        
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		DLL list = new DLL();
		list.insertFirst(3);
		list.insertFirst(9);
		list.insertLast(99);
		list.insertAfter(9,190);
		list.display();
	}
}
