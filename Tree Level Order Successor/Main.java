/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static LevelOrderSuccessor(TreeNode root,int key) {
		if(root==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            TreeNode node = queue.poll();
            if(node.left!=null){
                queue.offer(node.left);
            }

            if(node.right!=null){
                queue.offer(node.right);
            }
            if(node.val==key){
                break;
            }
        }
        
        System.out.println(queue.peek());
	}
}
