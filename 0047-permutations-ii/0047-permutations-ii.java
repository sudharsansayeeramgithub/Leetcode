class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        recursive(nums,ans,new boolean[nums.length],new ArrayList<>());
        return ans;
    }
    public void recursive(int[] nums,List<List<Integer>> ans,boolean[] used,List<Integer> path){
        if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            path.add(nums[i]);
            recursive(nums,ans,used,path);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}