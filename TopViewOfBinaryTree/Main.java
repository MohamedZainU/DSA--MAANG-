/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Tuple{
    TreeNode node;
    int val;
    
    public Tuple(TreeNode _node,int _val){
        this.node = _node;
        this.val = _val;
    }
}
public class Main
{
    public static List<Integer> topViewOfBinaryTree(TreeNode root){
        Queue<Tuple> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        q.offer(new Tuple(root,0));
        while(!q.isEmpty()){
            Tuple t = q.remove();
            TreeNode node = t.node;
            int x = t.val;
            
            if(map.get(x)==null){
                map.put(x,node.val);
            }
            
            if(node.left!=null){
                q.add(new Tuple(node.left,x-1));
            }
            
            if(node.right!=null){
                q.add(new Tuple(node.right,x+1));
            }
        }
        
        List<Integer> resultList = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> maps: map.entrySet()){
            resultList.add(maps.getValue());
        }
        
        return resultList;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Call the function to get the top view of the binary tree
        List<Integer> topView = topViewOfBinaryTree(root);
        System.out.println(topView);
	}
}