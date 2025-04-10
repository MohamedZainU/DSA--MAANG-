/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
    static void countSort(int arr[]){
        if(arr==null || arr.length<=1){
            return;
        }
        
        int max = arr[0];
        for(int num:arr){
           if(num>max){
               max = num;
           } 
        }
        
        int freq[] = new int[max + 1];
        
        for(int nums:arr){
            freq[nums]++;
        }
        int index=0;
        
        for(int j=0;j<=max;j++){
            while(freq[j]>0){
                arr[index] = j;
                index++;
                freq[j]--;
            }
        }
    }
    
    
	public static void main(String[] args) {
		int arr[] = {2,3,4,3,1,0,5,7};
		countSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
