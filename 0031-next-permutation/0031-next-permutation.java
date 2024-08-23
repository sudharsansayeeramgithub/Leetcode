class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1) return;
        int index1=nums.length-2;
        while(index1>=0 && nums[index1]>=nums[index1+1]) index1--;
        if(index1>=0){
            int index2=nums.length-1;
            while(nums[index2]<=nums[index1]) index2--;
            swap(nums,index1,index2);
        }
        reverse(nums,index1+1,nums.length-1);
    }
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j) swap(nums,i++,j--);
    }
}