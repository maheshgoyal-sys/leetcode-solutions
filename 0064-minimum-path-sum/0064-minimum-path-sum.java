class Solution {
    
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m+1][n+1];
        int s=0;
        for(int i=0;i<m;i++){
            s+=grid[i][0];
            dp[i][0]=s;
        }
        s=0;
        for(int j=0;j<n;j++){
            s+=grid[0][j];
            dp[0][j]=s;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int cost = grid[i][j];
                dp[i][j] = Math.min(cost+dp[i-1][j],cost+dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
}