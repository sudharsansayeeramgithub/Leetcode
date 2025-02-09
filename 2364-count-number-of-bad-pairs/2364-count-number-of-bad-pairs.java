class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> map=new HashMap<>();

        long cntBadPair=(long)(n-1)*n/2; //Initialize with the totalPair
        for(int i=0; i<n; i++){
            int val=map.getOrDefault(nums[i]-i,0);
            cntBadPair-=val;  //Minus the goodPair
            map.put(nums[i]-i, val+1);    

            // Formula: Please re-arrange it
            // j - i != nums[j] - nums[i].
            // nums[i] - i = nums[j] - j 
        }


        return cntBadPair; 
    }
}