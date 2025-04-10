class BST{
    private Node root;
    public class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;
        
        public Node(int val){
            this.val = val;
        }
    }
    
    public BST(){
        
    }
    
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    
    public boolean isEmty(){
        return root == null;
    }
    
    public void insert(int value){
        root = insert(value,root);
    }
    
    public Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value < node.val){
            node.left = insert(value,node.left);
        }
        
        if(value > node.val){
            node.right = insert(value,node.right);
        }
        
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    
    public void populateSorted(int nums[]){
        populateSorted(nums,0,nums.length);
    }
    
    public void preOrder(){
        preOrder(root);
    }
    
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
    
    
    public void inOrder(){
        inOrder(root);
    }
    
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }
    
    public void postOrder(){
        postOrder(root);
    }
    
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }
    
    

    
    
    
    private void populateSorted(int nums[],int start,int end){
        if(start>=end){
            return;
        }
        
        int mid = (start + end) /2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }
    
    public void populate(int nums[]){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }
    
    public void display(){
        display(root," Root Node: ");
    }
    
    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.val);
        display(node.left," Left Node: "+node.val+" : ");
        display(node.right," Right Node: "+node.val+" : ");
    }
    
    
    public boolean balanced(){
        return balanced(root);
    }
    
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}