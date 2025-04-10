/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] arr = { {0, 0, 0},
                    {1, 1, 0},
                    {1, 1, 0} };
                    
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {1, -1}, {1, 1}, {-1, 1}};
        int n = arr.length;
        Queue<int[]> pq = new LinkedList<>();
        pq.offer(new int[]{0,0,1});
        boolean[][] vis = new boolean[n][n];
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int x = curr[0];
            int y = curr[1];
            int path = curr[2];
            
            
            
            if(x==n-1 && y==n-1){
                System.out.println(path);
                return;
            }
            
            for(int[] dir:directions){
                int newR = x + dir[0];
                int newC = y + dir[1];
                
                if(newR>=0 && newR<n && newC>=0 && newC<n && arr[newR][newC]==0 && !vis[newR][newC]){
                    pq.offer(new int[]{newR,newC,path+1});
                    vis[newR][newC] = true;
                }
            }
        }
	}
}
