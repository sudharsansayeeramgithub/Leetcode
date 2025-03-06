class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> seen=new LinkedHashSet<>();
        int[] result=new int[2];
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(seen.contains(grid[i][j])){
                    result[0]=grid[i][j];
                }
                seen.add(grid[i][j]);
            }
        }
        int sum=0;
        for(int num:seen){
            sum+=num;
        }
        result[1]=((m*n)*((m*n)+1))/2-sum;
        return result;
    }
}