class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int left=0,numberOfGroups=0;
        for(int right=0;right<colors.length+k-1;right++){
            if(right>0 && colors[right%colors.length]==colors[(right-1)%colors.length]){
                left=right;
            }
            if(right-left+1>=k){
                numberOfGroups++;
            }
        }
        return numberOfGroups;
    }
}