class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] frequency=new int[k];
        for(int num:arr){
            int rem=num%k;
            if(rem<0){
                rem=rem+k;
            }
            frequency[rem]++;
        }
        if(frequency[0]%2!=0){
            return false;
        }
        for(int i=1;i<=k/2;i++){
            if(frequency[i]!=frequency[k-i]){
                return false;
            }
        }
        return true;
    }
}