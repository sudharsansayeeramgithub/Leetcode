class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                count+=check(words[i],words[j]);
            }
        }
        return count;
    }
    public int check(String s,String t){
        Set<Character> sset=new HashSet<>();
        Set<Character> tset=new HashSet<>();
        for(int i=0;i<s.length();i++){
            sset.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            tset.add(t.charAt(i));
        }
        return sset.equals(tset) ? 1: 0;
    }
}