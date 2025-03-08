class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white=0,minWhite;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)!='B'){
                white++;
            }
        }
        minWhite=white;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                white++;
            }
            if(blocks.charAt(i-k)=='W'){
                white--;
            }
            minWhite=Math.min(white,minWhite);
        }
        return minWhite;
    }
}