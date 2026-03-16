class Solution {
    static int c=0;
    static int max=0;
    public static void dfs(int i,int j,boolean vis[][],int grid[][],int m,int n){
        if(i<0 || j< 0 || i>=m || j>=n || grid[i][j]!=1 || vis[i][j]){
            return;
        }
        c++;
        vis[i][j] = true;
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};
        for(int k=0;k<4;k++){
            dfs(i+dr[k],j+dc[k],vis,grid,m,n);
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        max=0;
        c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dfs(i,j,vis,grid,m,n);
                    max=Math.max(max,c);
                    c=0;
                }
            }
        }  
        return max; 
    }
}