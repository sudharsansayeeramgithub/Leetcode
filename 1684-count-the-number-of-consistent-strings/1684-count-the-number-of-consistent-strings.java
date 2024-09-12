class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistent=0;
        Set<Character> iscontains=new HashSet<>();
        for(char c:allowed.toCharArray()){
            iscontains.add(c);
        }
        for(String word:words){
            boolean isconsistent=true;
            for(char c:word.toCharArray()){
                if(!iscontains.contains(c)){
                    isconsistent=false;
                    break;
                }
            }
            if(isconsistent){
                consistent++;
            }
        }
        return consistent;
    }
}