/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void quickSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];
        
        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            
            while(arr[e]>pivot){
                e--;
            }
            
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
    
	public static void main(String[] args) {
		int arr[] = {5,3,4,1,2};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
