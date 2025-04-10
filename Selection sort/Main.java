/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
    static void swap(int arr[],int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    static int getMax(int arr[],int start,int end){
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max] > arr[i]){
                max = i;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		int arr[] = {1,7,4,5,6};
		for(int i=0;i<arr.length;i++){
		    int last = arr.length-i-1;
		    int max = getMax(arr,0,last);
		    swap(arr,max,last);
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
