/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    int countPaths(Node node,int sum){
        List<Integer> list = new LinkedList<>();
        return helper(node,sum,list);
    }
    
    public int helper(Node node,int sum,List<Integer> list){
        ListIterator<Integer> it = list.listIterator(list.size());
        if(node==null){
            return 0;
        }
        int count = 0,s=0;
        list.add(node.val);
        while(it.hasPrevious()){
            sum += it.previous();
            if(s == sum){
                count++;
            }
        }
        return count += helper(node.left,sum,list) + helper(node.right,sum,list);
        list.remove(list.size()-1);
        return count;
    }
    
    
	public static void main(String[] args) {
		
	}
}
