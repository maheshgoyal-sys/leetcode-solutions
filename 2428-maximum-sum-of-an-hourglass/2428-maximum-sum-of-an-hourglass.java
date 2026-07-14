class Solution {
    public static long helper(int grid[][],int i,int j){
        return grid[i][j] + grid[i][j+1] + grid[i][j+2]
         + grid[i+1][j+1]
         + grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];
    }

    public int maxSum(int[][] grid) {
       int m = grid.length;
       int n= grid[0].length;
       long ans=0;
       for(int i=0;i<=m-3;i++){
        for(int j=0;j<=n-3;j++){
            ans=Math.max(helper(grid,i,j),ans);
        }
       } 
       return (int)ans;
    }
}