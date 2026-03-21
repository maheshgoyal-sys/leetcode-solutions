class Solution {
    class Pair{
        int row;
        int col;
        int diff;
        Pair(int r, int c, int d){
        row = r;
        col = c;
        diff = d;
    }
    }
    public int minimumEffortPath(int[][] grid) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->
        a.diff-b.diff);
        pq.add(new Pair(0,0,0));
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int currow = pair.row;
            int currcol = pair.col;
            int currdiff = pair.diff;
            if(vis[currow][currcol]){
                continue;
            }
            vis[currow][currcol] = true;
            if(currow == m-1 && currcol==n-1)   return currdiff;

            for(int i=0;i<4;i++){
                int newrow = currow + dr[i];
                int newcol = currcol + dc[i];
                if(newrow>=0 && newcol>=0 && newrow<m && newcol<n){
                    int diff = Math.max(currdiff,Math.abs(grid[newrow][newcol] -  grid[currow][currcol]));
                    pq.add(new Pair(newrow,newcol,diff));
                }
            }
        }
        return 0;
    }
}         