class Solution {
    public static void  dfs(int i,int j,char[][] board,boolean vis[][]){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || vis[i][j] || board[i][j]!='O'){
            return;
        }
        vis[i][j]=true;
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};
        for(int k=0;k<4;k++){
            dfs(i+dr[k],j+dc[k],board,vis);
        }
    }
    public void solve(char[][] board) {
        boolean vis[][] = new boolean[board.length][board[0].length];
        // ✅ Top & Bottom rows
for(int j = 0; j < board[0].length; j++){
    if(board[0][j] == 'O') dfs(0, j, board, vis);
    if(board[board.length - 1][j] == 'O') dfs(board.length - 1, j, board, vis);
}

// ✅ Left & Right columns
for(int i = 0; i < board.length; i++){
    if(board[i][0] == 'O') dfs(i, 0, board, vis);
    if(board[i][board[0].length - 1] == 'O') dfs(i, board[0].length - 1, board, vis);
}
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }
}