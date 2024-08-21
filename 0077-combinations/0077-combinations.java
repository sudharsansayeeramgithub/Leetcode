class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer=new ArrayList<>();
        int[] nums=new int[n];
        for(int i=0;i<n;i++) nums[i]=i+1;
        findCombinations(0,k,nums,answer,new ArrayList<>());
        return answer;
    }
    public void findCombinations(int index,int k,int[] nums,List<List<Integer>> answer,List<Integer> part){
        if(part.size()==k){
            answer.add(new ArrayList<>(part));
            return;
        }
        for(int i=index;i<nums.length;i++){
            part.add(nums[i]);
            findCombinations(i+1,k,nums,answer,part);
            part.remove(part.size()-1);
        }
    }
}