/*The Kolar Gold Fields (KGF) is in the form of a m*n grid,
Each field, contains some amount of Gold in it.
 
You can mine the gold in the KGF in the following way.
	- You can start at any position in the grid, never visit a cell with no gold.
	- each time you visit a cell, you will grab all the gold in it.
	- You can move one step to the left, right, up or down.
	- You can't visit the same cell more than once.
	- You can stop at any cell.
	
Your task is to find the maximum amount of gold you can collect.
*/

import java.util.*;
class Solution{
   
    public int getMaximumGold(int[][] grid) {
        //Implement your logic here.
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]!=0){
                    max= Math.max(max,fun(grid,i,j));
                }
            }
        }
        return max;
    }
    int fun(int grid[][], int row, int col){
        if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1 || grid[row][col]==0){
            return 0;
        }
        else{
            int m=0;
            int x= grid[row][col];
            grid[row][col]=0;
            m=Math.max(m,fun(grid,row-1,col));
            m=Math.max(m,fun(grid,row,col+1));
            m=Math.max(m,fun(grid,row+1,col));
            m=Math.max(m,fun(grid,row,col-1));
            grid[row][col]=x;
            return m+x;
        }
    }
}
