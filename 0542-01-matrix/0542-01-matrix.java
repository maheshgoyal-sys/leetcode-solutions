class Solution {
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[][] = new int[m][n];
        // for(int i = 0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         ans[i][j]=mat[i][j];
        //     }
        // }
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    ans[i][j]=0;
                    q.add(new Pair(i,j));
                }
                else{
                    ans[i][j]=-1;
                }
            }
        }
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};
        // int c=0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
            Pair pair = q.poll();
            int r = pair.i;
            int c = pair.j;
            for(int k=0;k<4;k++){
                int newrow = r+dr[k];
                int newcol = c+dc[k];
                if(newrow>=0 && newcol>=0 && newrow<m && newcol<n &&ans[newrow][newcol]==-1){
                    ans[newrow][newcol] = ans[r][c] + mat[newrow][newcol];
                    q.add(new Pair(newrow,newcol));
                }
            }

            }
            
        }
        return ans;
    }
}