class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int numberOfIslands=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    numberOfIslands++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return numberOfIslands;
    }
    private void dfs(int row,int col,char[][] grid,boolean[][] visited){
        visited[row][col]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,-1,0,1};
        for(int i=0;i<4;i++){
            int newrow=row+drow[i];
            int newcol=col+dcol[i];
            if(newrow>=0 && newrow<grid.length && newcol>=0 && newcol<grid[0].length && grid[newrow][newcol]=='1' && !visited[newrow][newcol]){
                dfs(newrow,newcol,grid,visited);
            }
        }
    }
}
