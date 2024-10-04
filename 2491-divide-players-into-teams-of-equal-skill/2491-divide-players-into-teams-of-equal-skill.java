class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int start=0,end=skill.length-1;
         int target=skill[start]+skill[end];
        long result=0;
        while(start<=end){
            if(skill[start]+skill[end]!=target){
                return -1;
            }else{
                result+=skill[start]*skill[end];
                start++;
                end--;
            }
        }
        return result;
    }
}