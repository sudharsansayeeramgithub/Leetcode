class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        findingSubsets(0,nums,answer,new ArrayList<>());
        return answer;
    }
    private void findingSubsets(int index,int[] nums,List<List<Integer>> answer,List<Integer> part){
        if(index==nums.length){
            answer.add(new ArrayList<>(part));
            return;
        }
        findingSubsets(index+1,nums,answer,part);
        part.add(nums[index]);
        findingSubsets(index+1,nums,answer,part);
        part.remove(part.size()-1);
    }
}