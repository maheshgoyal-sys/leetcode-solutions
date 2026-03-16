class Solution {
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshcount = 0;
        int time = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    freshcount++;
                }
            }
        }

        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};

        while(!q.isEmpty() && freshcount>0){

            int size = q.size();
            time++;

            for(int i=0;i<size;i++){

                int arr[] = q.poll();
                int r = arr[0];
                int c = arr[1];

                for(int k=0;k<4;k++){

                    int nr = r + dr[k];
                    int nc = c + dc[k];

                    if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1){

                        grid[nr][nc] = 2;
                        freshcount--;

                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }

        if(freshcount==0) return time;
        return -1;
    }
}