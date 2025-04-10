/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public boolean path(Node node,int arr[],int index){
        if(node==null){
            return true;
        }
        
        if(index >= arr.length || node.val != arr[index]){
            return false;
        }
        
        if(index == arr.length && node.left==null && node.right==null){
            return true;
        }
        
        return path(node.left,arr,index+1) || path(node.right,arr,index+1);
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
