class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maximumCandies=0;
        for(int i=0;i<candies.length;i++){
            maximumCandies=Math.max(candies[i],maximumCandies);
        }
        int left=0,right=maximumCandies;
        while(left<right){
            int mid=(left+right+1)/2;
            if(maximumPerson(candies,k,mid)){
                left=mid;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    private boolean maximumPerson(int[] candies,long k,int maximumCandies){
        long noOfPerson=0;
        for(int i=0;i<candies.length;i++){
            noOfPerson+=candies[i]/maximumCandies;
        }
        return noOfPerson>=k;
    } 
}