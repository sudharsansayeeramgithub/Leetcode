class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> seen=new LinkedHashSet<>();
        int[] result=new int[2];
        int m=grid.length,sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(seen.contains(grid[i][j])){
                    result[0]=grid[i][j];
                }else{
                    seen.add(grid[i][j]);
                    sum+=grid[i][j];
                }
            }
        }
        result[1]=((m*m)*((m*m)+1))/2-sum;
        return result;
    }
}