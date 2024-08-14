class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> frequencyMap=new HashMap<>();
        for(char c:s.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
        }
        int i=0;
        for(char c:s.toCharArray()){
            if(frequencyMap.get(c)==1){
                return i;
            }
            i++;
        }
        return -1;
    }
}