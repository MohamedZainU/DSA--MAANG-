/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int update(int arr[],int target){
        int start = 0;
        int end = 1;
        
        while(target>arr[end]){
            int newS = end + 1;
            
            end = end + (end - start + 1)*2;
            start = newS;
        }
        return binarySearch(arr,target,start,end);
    }
    
    public static int binarySearch(int arr[],int target,int start,int end){
        
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    
    
	public static void main(String[] args) {
	    int arr[] = {3,5,7,9,10,90,100,130,140,160,170};
	    int target = 10;
	    System.out.println(update(arr,target));
	}
}
