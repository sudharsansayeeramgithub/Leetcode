class Solution {
    public long coloredCells(int n) {
        long total=0,num=(long)n;
        for(long i=1;i<num*2;i=i+2){
            if(i==1){
                total=total+(num*2)-i;
            }
            else{
                total=total+((num*2)-i)*2;
            }
        }
        return (long)total;
    }
}