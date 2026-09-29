class Solution {
    public static boolean helper(int i,int j,int m,int n,int c,char[][] grid,boolean dp[][][],boolean vis[][][]){
        if(i>=m || j>=n || c<0){
            return false;
        }
        if(grid[i][j]=='('){
            c++;
        }
        else{
            c--;
        }
        if(c < 0){
    return false;
}
        if(i==m-1 && j==n-1){
            return c==0;
        }
        if(vis[i][j][c]){
            return dp[i][j][c];
        }
        vis[i][j][c]=true;
        boolean right = helper(i+1,j,m,n,c,grid,dp,vis);
        boolean down = helper(i,j+1,m,n,c,grid,dp,vis);
        return dp[i][j][c] = right || down;
    }
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean dp[][][] = new boolean[m][n][m+n+1];
        boolean vis[][][] = new boolean[m][n][m+n+1];
        return helper(0,0,m,n,0,grid,dp,vis);
        
    }
}