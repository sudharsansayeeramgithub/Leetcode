class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,r=k,l=0,maxSum;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        while(r<nums.length){
            sum+=nums[r++]-nums[l++];
            maxSum=Math.max(maxSum,sum);
        }
        return (double)maxSum/k;
    }
}