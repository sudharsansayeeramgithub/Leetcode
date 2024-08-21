class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        findPermutations(0,nums,answer);
        return answer;
    }
    public void findPermutations(int index,int[] nums,List<List<Integer>> answer){
        if(index==nums.length){
            List<Integer> subset=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                subset.add(nums[i]);
            }
            answer.add(new ArrayList<>(subset));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            findPermutations(index+1,nums,answer);
            swap(i,index,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}