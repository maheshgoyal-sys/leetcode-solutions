class Solution {
    static long sum=0;
    static long count = 0;
    public static void dfs(int i,int j,boolean vis[][],int grid[][],int k){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || 
        grid[i][j]==0 || vis[i][j]){
            return;
        }
        sum+=grid[i][j];
        
        vis[i][j] = true;
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};
        for(int l=0;l<4;l++){
            dfs(i+dr[l],j+dc[l],vis,grid,k);
        }
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0 && !vis[i][j]){
                    sum=0;
                    dfs(i,j,vis,grid,k);
                    if(sum%k==0)    count++;
                }
            }
        }
        return (int)count;
    }
}