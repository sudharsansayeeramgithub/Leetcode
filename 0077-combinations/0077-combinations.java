class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer=new ArrayList<>();
        findCombinations(1,k,n,answer,new ArrayList<>());
        return answer;
    }
    public void findCombinations(int index,int k,int n,List<List<Integer>> answer,List<Integer> part){
        if(part.size()==k){
            answer.add(new ArrayList<>(part));
            return;
        }
        for(int i=index;i<=n;i++){
            part.add(i);
            findCombinations(i+1,k,n,answer,part);
            part.remove(part.size()-1);
        }
    }
}