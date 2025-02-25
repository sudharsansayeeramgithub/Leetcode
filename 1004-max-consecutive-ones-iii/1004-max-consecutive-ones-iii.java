class Solution {
    public int longestOnes(int[] nums, int k) {
        int count0=0,l=0,r=0,max=Integer.MIN_VALUE;
        while(r<nums.length){
            if(nums[r]==0){
                count0++;
            }
            while(count0>k){
                if(nums[l]==0) count0--;
                l++;
            }
            if(count0<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}