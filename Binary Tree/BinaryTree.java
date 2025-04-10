import java.util.*;
class BinaryTree{
    private Node root;
    public BinaryTree(){
        
    }
    
    private class Node{
        int val;
        Node left;
        Node right;
        
        public Node(int val){
            this.val = val;
        }
    }
    
    public void populate(Scanner sc){
        System.out.println("Enter the value");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    
    public void populate(Scanner sc,Node node){
        System.out.println("Left : "+node.val);
        boolean left = sc.nextBoolean();
        if(left){
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        
        System.out.println("Right : "+node.val);
        boolean right = sc.nextBoolean();
        if(right){
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }
    
    public void display(){
        display(root,"");
    }
    
    public void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }
}