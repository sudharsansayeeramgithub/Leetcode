class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastOccurance=new int[26];
        for(int i=0;i<s.length();i++){
            lastOccurance[s.charAt(i)-'a']=i;
        }
        int partitionEnd=0,partitionStart=0;
        List<Integer> partitionSizes=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            partitionEnd=Math.max(partitionEnd,lastOccurance[s.charAt(i)-'a']);
            if(i==partitionEnd){
            partitionSizes.add(i-partitionStart+1);
            partitionStart=i+1;
            }
        }
        return partitionSizes;
    }
}