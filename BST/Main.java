/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		BST tree = new BST();
		int nums[] = {1,2,0,7,5,4};
		tree.populate(nums);
		tree.inOrder();
		tree.display();
	}
}
