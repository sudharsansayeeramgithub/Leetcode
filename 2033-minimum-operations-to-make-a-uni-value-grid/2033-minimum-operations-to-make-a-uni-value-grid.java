class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> nums=new ArrayList<>();
        int operations=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                nums.add(grid[i][j]);
            }
        }
        Collections.sort(nums);
        int length=nums.size();
        int finalCommanNumber=nums.get(length/2);
        for(Integer num:nums){
            if(num%x!=finalCommanNumber%x){
                return -1;
            }else{
                operations+=Math.abs(finalCommanNumber-num)/x;
            }
        }
        return operations;
    }
}