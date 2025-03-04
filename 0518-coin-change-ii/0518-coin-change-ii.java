class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return coinChange(amount,coins,n-1,dp);
    }
    private int coinChange(int amount,int[] coins,int index,int[][] dp){
        if(index==0){
            return (amount%coins[index]==0)? 1:0;
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int notTake=coinChange(amount,coins,index-1,dp);
        int take=0;
        if(coins[index]<=amount){
            take=coinChange(amount-coins[index],coins,index,dp);
        }
        return dp[index][amount]=take+notTake;
    }
}