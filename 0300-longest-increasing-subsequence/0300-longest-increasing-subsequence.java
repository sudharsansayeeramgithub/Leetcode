class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return lengthHelper(nums,n,0,-1,dp);
    }
    public int lengthHelper(int[] nums,int n,int index,int prev_index,int[][] dp){
        if(index==n){
            return 0;
        }
        if(dp[index][prev_index+1]!=-1){
            return dp[index][prev_index+1];
        }
        int notTake=0+lengthHelper(nums,n,index+1,prev_index,dp);
        int take=0;
        if(prev_index==-1 || nums[index]>nums[prev_index]){
            take=1+lengthHelper(nums,n,index+1,index,dp);
        }
        return dp[index][prev_index+1]=Math.max(take,notTake);
    }
}