/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Tree in order -   left  root right
//      post order - left right root 
//      pre order -  root left right

public class Main
{
    public static void traverse(int arr[],int index){
        if(index<arr.length){
        traverse(arr,2*index+1);
        System.out.println(arr[index]);
        traverse(arr,2*index+2);
        }
    }
    
    
	public static void main(String[] args) {
		int[] arr = {8, 23, 36, 17, 29};
		traverse(arr,0);
	}
}
