class Solution {
    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]){
                    if(detectCycle(i,j,grid,visited,i,j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean detectCycle(int row,int col,char[][] grid,boolean[][] visited,int row0,int col0){
        visited[row][col]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        for(int i=0;i<4;i++){
            int newrow=drow[i]+row;
            int newcol=dcol[i]+col;
            if(newrow>=0 && newrow<grid.length && newcol>=0 && newcol<grid[0].length){
                if(grid[row][col]!=grid[newrow][newcol]) continue;
                if(newrow==row0 && newcol==col0) continue;
                if(visited[newrow][newcol]) return true;
                if(detectCycle(newrow,newcol,grid,visited,row,col)) return true; 
            }
        }
        return false;
    }
}