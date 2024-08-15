class Solution {
    public boolean judgeSquareSum(int c) {
        int start=0,end=(int)Math.sqrt(c);
        while(start<=end){
            long sum=(long)start*start+(long)end*end;
            if(sum==c){
                return true;
            }if(sum<c){
                ++start;
            }else{
                --end;
            }
        }
        return false;
    }
}