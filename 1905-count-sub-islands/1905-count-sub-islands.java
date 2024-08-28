class Solution {
    int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};int[][] visited;
    int rows,cols;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        rows=grid1.length;
        cols=grid1[0].length;
        visited=new int[rows][cols];
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                visited[r][c]=grid2[r][c];
            }
        }
        int subIslands=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(visited[r][c]==1&&dfs(r,c,grid1)){
                    subIslands++;
                }
            }
        }
        return subIslands;
    }
    private boolean dfs(int r,int c,int[][] grid1){
        if(r<0||r>=rows||c<0||c>=cols||visited[r][c]==0){
            return true;
        }
        visited[r][c]=0;
        boolean check=grid1[r][c]==1;
        for(int[] dir:directions){
            if(!dfs(r+dir[0],c+dir[1],grid1)){
                check=false;
            }
        }
        return check;
    }
}