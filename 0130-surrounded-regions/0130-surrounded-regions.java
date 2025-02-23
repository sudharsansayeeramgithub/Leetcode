class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            if(board[i][0]=='O') dfs(i,0,board);
            if(board[i][n-1]=='O') dfs(i,n-1,board);
        }
        for(int i=0;i<n;i++){
            if(board[0][i]=='O') dfs(0,i,board);
            if(board[m-1][i]=='O') dfs(m-1,i,board);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='T'){
                    board[i][j]='O';
                }
            }
        }
    }
    private void dfs(int row,int col,char[][] board){
        if(row<0||row>=board.length||col<0||col>=board[0].length||board[row][col]!='O'){
            return;
        }
        board[row][col]='T';
        int[] drow={-1,0,1,0};
        int[] dcol={0,-1,0,1};
        for(int i=0;i<4;i++){
            dfs(row+drow[i],col+dcol[i],board);
        }
    }
}