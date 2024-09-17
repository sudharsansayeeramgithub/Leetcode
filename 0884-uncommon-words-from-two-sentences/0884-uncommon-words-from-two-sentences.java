class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> result=new ArrayList<>();
        Map<String,Integer> frequency=new HashMap<>();
        for(String i:s1.split(" ")){
            frequency.put(i,frequency.getOrDefault(i,0)+1);
        }
        for(String i:s2.split(" ")){
            frequency.put(i,frequency.getOrDefault(i,0)+1);
        }
        for(Map.Entry<String,Integer> entry: frequency.entrySet()){
            if(entry.getValue()==1){
                result.add(entry.getKey());
            }
        }         

        return result.toArray(new String[0]);
    }
}