class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        PalindromePartition(0,s,result,new ArrayList<>());
        return result;
    }
    public void PalindromePartition(int start,String s,List<List<String>> result,List<String> path){
        if(start==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(isPalindrome(start,i,s)){
                path.add(s.substring(start,i+1));
                PalindromePartition(i+1,s,result,path);
                path.remove(path.size()-1);
            }
        }

    }
    public boolean isPalindrome(int l,int r,String s){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}