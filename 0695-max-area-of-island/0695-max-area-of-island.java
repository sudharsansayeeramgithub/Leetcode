class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int maxArea=0;
        for(int i=0;i<m;i++){
            int area=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==1&&!visited[i][j]){
                    area=dfs(i,j,grid,visited);
                    maxArea=Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }
    private int dfs(int row,int col,int[][] grid,boolean[][] visited){
        visited[row][col]=true;int area=1;
        int[] drow={-1,0,1,0};
        int[] dcol={0,-1,0,1};
        for(int i=0;i<4;i++){
            int newrow=row+drow[i];
            int newcol=col+dcol[i];
            if(newrow>=0 && newrow<grid.length && newcol>=0 && newcol<grid[0].length && grid[newrow][newcol]==1 && !visited[newrow][newcol]){
                area+=dfs(newrow,newcol,grid,visited);
            }
        }
        return area;
    }
}