class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0,right=k;
        int white=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)!='B'){
                white++;
            }
        }
        int minWhite=white;
        for(int i=k;i<blocks.length();i++){
            if((blocks.charAt(i)=='B'&&blocks.charAt(left)=='B')||(blocks.charAt(i)=='W'&&blocks.charAt(left)=='W')){
                left++;
                continue;
            }
            else if(blocks.charAt(i)=='W' && blocks.charAt(left)=='B'){
                white++;
            }
            else{
                white--;
            }
            left++;
            minWhite=Math.min(white,minWhite);
        }
        return minWhite;
    }
}