class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int rowCount=grid.length,colCount=grid[0].length;
        int[] result=new int[queries.length];
        int[] dRow={0,1,0,-1};
        int[] dCol={-1,0,1,0};
        int[][] sortedQueries=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            sortedQueries[i][0]=queries[i];
            sortedQueries[i][1]=i;
        }
        Arrays.sort(sortedQueries,Comparator.comparingInt(a->a[0]));
        PriorityQueue<int[]> minHeap=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        boolean[][] visited=new boolean[rowCount][colCount];
        int totalPoints=0;
        minHeap.add(new int[]{grid[0][0],0,0});
        visited[0][0]=true;
        for(int[] query:sortedQueries){
            int queryValue=query[0],queryIndex=query[1];
            while(!minHeap.isEmpty()&&minHeap.peek()[0]<queryValue){
                int[] top=minHeap.poll();
                int cellValue=top[0],currentRow=top[1],currentCol=top[2];
                totalPoints++;
                for(int i=0;i<4;i++){
                    int newRow=currentRow+dRow[i];
                    int newCol=currentCol+dCol[i];
                    if(newRow>=0 && newRow<rowCount && newCol>=0 && newCol<colCount && !visited[newRow][newCol]){
                        minHeap.add(new int[]{grid[newRow][newCol],newRow,newCol});
                        visited[newRow][newCol]=true;
                    }
                }
            }
            result[queryIndex]=totalPoints;
        }
        return result;
    }
}