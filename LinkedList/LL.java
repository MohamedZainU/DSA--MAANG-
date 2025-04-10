class LL{
    
    private Node head;
    private Node tail;
    private int size;
    
    public LL(){
        this.size = 0;
    }
    
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if(tail==null){
            tail = head;
        }
        
        size++;
    }
    
    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    
    //Length of LinkedList Cycle
    
    public int hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f!=null && f.next!=null){
            f = f.next.next;
            s = s.next;
            if(f==s){
                ListNode temp = slow;
                int length=0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return false;
    }
    
    public void reverse(Node node){
        if(node==tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    
    public static LL mergeTwoList(LL first,LL second){
        Node f = first.head;
        Node s = second.head;
        
        
        LL ans = new LL();
        
        while(f!=null && s!=null){
            if(f.val < s.val){
                ans.insertLast(f.val);
                f = f.next;
            }else{
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        
        while(f!=null){
            ans.insertLast(f.val);
            f = f.next;
        }
        
        while(s!=null){
            ans.insertLast(s.val);
            s = s.next;
        }
        
        return ans;
    }
    
    
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        
        if(index==size){
            insertLast(val);
            return;
        }
        
        Node temp = head;
        
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    
    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }
    
    public int deleteLast(){
        int val = tail.val;
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.next = null;
        size++;
        return val;
    }
    
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        
        node.next = insertRec(val,index-1,node.next);
        return node;
    }
    
    
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        
        if(index==size-1){
            return deleteLast();
        }
        
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }
    
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val==val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    
    public void display(){
        Node temp = head;
        
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    
    private class Node{
        private int val;
        private Node next;
        
        public Node(int val){
            this.val = val;
        }
        
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
    }
}