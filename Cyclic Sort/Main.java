/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {0,3,1,2};
		int i=0;
		while(i<arr.length){
		    int correct = arr[i] - 1;
		    if(arr[correct] != arr[i]){
		        int temp = arr[i];
		        arr[i] = arr[correct];
		        arr[correct] = temp;
		    }else{
		        i++;
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}
