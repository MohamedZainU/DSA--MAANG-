/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {1,3,0,7,4};
		for(int i=0;i<arr.length-1;i++){
		    for(int j=i+1;j>0;j--){
		        if(arr[j]>arr[j-1]){
		            int temp = arr[j];
		            arr[j] = arr[j-1];
		            arr[j-1] = temp;
		        }else{
		            break;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
    }
}
