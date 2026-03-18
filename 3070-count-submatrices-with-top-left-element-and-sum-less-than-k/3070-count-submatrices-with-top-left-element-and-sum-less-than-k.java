class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans[][] = new int[m][n];
        ans[0][0] = grid[0][0];
        for(int i=1;i<n;i++){
            ans[0][i] = ans[0][i-1] + grid[0][i];
        }
        for(int i=1;i<m;i++){
            ans[i][0] = ans[i-1][0] + grid[i][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int dia = ans[i-1][j-1];
                int upper = ans[i-1][j]-dia;
                int lower = ans[i][j-1]-dia;
                ans[i][j] = grid[i][j] + dia + upper + lower;
            }
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ans[i][j]<=k)    c++;
            }
        }
        return c;
    }
}