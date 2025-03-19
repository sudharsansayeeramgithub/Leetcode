class Solution {
    public int minOperations(int[] nums) {
        int numberOfOnes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                numberOfOnes++;
            }
        }
        int operations=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && i>nums.length-3){
                return -1;
            }
            if(nums[i]==0){
                for(int j=i;j<i+3;j++){
                    if(nums[j]==1){
                        nums[j]=0;
                    }else{
                        nums[j]=1;
                    }
                }
                operations++;
            }
        }
        return operations;
    }
}