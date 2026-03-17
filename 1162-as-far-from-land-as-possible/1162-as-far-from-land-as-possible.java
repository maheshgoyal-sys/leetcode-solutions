class Solution {
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int maxDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j));
                }
            }
        }
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1}; 
        int dis = 0;
        boolean counter = false;
        while(!q.isEmpty()){
            int size= q.size();
            counter = false;
            for(int i=0;i<size;i++){
                Pair pair = q.poll();
                int r = pair.i;
                int c = pair.j;
                for(int k =0;k<4;k++){
                    int newrow = r + dr[k];
                    int newcol = c + dc[k];
                    if(newrow>=0 && newcol>=0 && newrow<m && newcol < n && grid[newrow][newcol]==0){
                        grid[newrow][newcol] = 1;
                        q.add(new Pair(newrow,newcol));
                        counter = true;
                    }
                }
            }
            if(counter) dis++;
        }  
        return dis==0 ? -1 : dis;     
    }
}