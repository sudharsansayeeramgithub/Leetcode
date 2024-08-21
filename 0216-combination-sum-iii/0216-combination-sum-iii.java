class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> answer=new ArrayList<>();
        findCombination(k,n,0,nums,answer,new ArrayList<>(),0);
        return answer;
    }
    public void findCombination(int k,int n,int index,int[] nums,List<List<Integer>> answer,List<Integer> part,int variable_sum){
        if(part.size()==k){
            if(variable_sum==n){
                answer.add(new ArrayList<>(part));
            }
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(variable_sum+nums[i]>n){
                break;
            }
            part.add(nums[i]);
            findCombination(k,n,i+1,nums,answer,part,variable_sum+nums[i]);
            part.remove(part.size()-1);
        }
    }
}