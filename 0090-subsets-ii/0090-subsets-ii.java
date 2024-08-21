class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        Arrays.sort(nums);
        findSubsetswithoutduplicates(0,nums,answer,new ArrayList<>());
        return answer;
    }
    public void findSubsetswithoutduplicates(int index,int[] nums,List<List<Integer>> answer,List<Integer> part){
        answer.add(new ArrayList<>(part));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            part.add(nums[i]);
            findSubsetswithoutduplicates(i+1,nums,answer,part);
            part.remove(part.size()-1);
        }
    }
}