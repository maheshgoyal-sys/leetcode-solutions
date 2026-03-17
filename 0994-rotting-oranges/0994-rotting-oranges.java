class Solution {
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int freshcount = 0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                }
                if(grid[i][j]==1){
                    freshcount++;
                }
            }
        }
            int dr[] = {-1,0,1,0};
            int dc[] = {0,-1,0,1};
        if(freshcount==0)   return 0;
        int time = 0;
        while(!q.isEmpty()){
           int size = q.size();
             boolean changed = false;
           for(int i=0;i<size;i++){
            Pair pair = q.poll();
            int r = pair.i;
            int c = pair.j;
            for(int k=0;k<4;k++){
                int newrow = r+dr[k];
                int newcol = c+dc[k];
                if(newrow>=0 && newcol>=0 && newrow<m && newcol<n && grid[newrow][newcol]==1){
                    grid[newrow][newcol]=2;
                    q.add(new Pair(newrow,newcol));
                    freshcount--;
                    changed=true;
                }
            }
           }
            if(changed) time++;

        }
        return freshcount==0 ? time : -1;
    }
}