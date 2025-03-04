class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int result=coinChangeHelper(coins,n-1,amount,dp);
        return result>= (int)Math.pow(10,9) ? -1:result;
    }
    public int coinChangeHelper(int[] coins,int index,int amount,int[][] dp){
        if(index==0){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }else{
                return (int)Math.pow(10,9);
            }
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int notTake=0+coinChangeHelper(coins,index-1,amount,dp);
        int take=(int)Math.pow(10,9);
        if(coins[index]<=amount){
            take=1+coinChangeHelper(coins,index,amount-coins[index],dp);
        }
        return Math.min(take,notTake);
    }
}