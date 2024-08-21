class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        findPermutations(nums,freq,answer,new ArrayList<>());
        return answer;
    }
    public void findPermutations(int[] nums,boolean[] freq,List<List<Integer>> answer,List<Integer> subset){
        if(subset.size()==nums.length){
            answer.add(new ArrayList<>(subset));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                subset.add(nums[i]);
                findPermutations(nums,freq,answer,subset);
                freq[i]=false;
                subset.remove(subset.size()-1);
            }
        }
    }
}