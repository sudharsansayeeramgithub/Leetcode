class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        if((totalSum-target<0)||((totalSum-target)%2==1)) return 0;
        int s2=(totalSum-target)/2;
        int[][] dp=new int[nums.length][s2+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return countPartitions(nums.length-1,s2,nums,dp);
    }
    public int countPartitions(int index,int target,int[] nums,int[][] dp){
        if(index==0){
            if(target==0 && nums[0]==0){
                return 2;
            }
            if(target==0 || target==nums[0]){
                return 1;
            }
            return 0;
        }
        if(dp[index][target]!=-1){
            return dp[index][target];
        }
        int notTake=countPartitions(index-1,target,nums,dp);
        int take=0;
        if(nums[index]<=target){
            take=countPartitions(index-1,target-nums[index],nums,dp);
        }
        return dp[index][target]=take+notTake;
    }
}