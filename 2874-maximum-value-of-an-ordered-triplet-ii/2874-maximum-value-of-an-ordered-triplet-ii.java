class Solution {
    public long maximumTripletValue(int[] nums) {
        long res=0,imax=0,dmax=0;
        for(int i=0;i<nums.length;i++){
            res=Math.max(res,dmax*nums[i]);
            dmax=Math.max(dmax,imax-nums[i]);
            imax=Math.max(imax,nums[i]);
        }
        return res;
    }
}