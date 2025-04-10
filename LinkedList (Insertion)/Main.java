import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Main{

public static Node insertAtHead(Node head,int val){
  return new Node(val,head);
}

public static Node insertAtTail(Node head,int val){
  if(head==null){
    return new Node(val);
  }
  Node temp = head;
  while(temp.next!=null){
    temp = temp.next;
  }
  Node newNode = new Node(val);
  temp.next = newNode;
  return head;
}

public static Node insertAtValue(Node head,int val,int ele){
  if(head==null){
    return null;
  }
  Node temp = head;
  Boolean found = false;
  if(head.data == val){
    return new Node(ele,head);
  }
  while(temp.next!=null){
    if(temp.data == val){
      Node newOne = new Node(ele,temp.next);
      temp.next = newOne;
      found = true;
    }
    temp = temp.next;
  }
  if(!found){
    System.out.print("Element Not Found XD");
  }
  return head;
}

public static Node convertArray(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }


public static Node insertAtKthEle(Node head,int k,int val){
  if(head==null){
    if(k==1){
    return new Node(val,head);
    }else{
      return head;
    }
  }
  if(k==1){
    return new Node(val,head);
  }
  Node temp = head;
  int cnt = 0;
  while(temp!=null){
      cnt++;
    if(cnt==k-1){
      Node newOne = new Node(val);
      newOne.next = temp.next;
      temp.next = newOne;
      break;
    }
    temp = temp.next;
  }
  return head;
}
    public static void main(String[] args) {
      int arr[] = {2, 3, 7, 10, 11, 11, 25};
	  Node head = convertArray(arr);   
      head = insertAtHead(head,29);
      head = insertAtTail(head,69);
      head = insertAtKthEle(head,3,12);
      head = insertAtValue(head,10,27);
      Node temp = head;
      while(temp!=null){
          System.out.println(temp.data);
          temp = temp.next;
      }
  }
}