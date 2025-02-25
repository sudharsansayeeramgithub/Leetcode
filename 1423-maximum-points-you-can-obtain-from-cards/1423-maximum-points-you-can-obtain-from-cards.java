class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0,rightSum=0,maxSum=0,rightIndex=cardPoints.length-1;
        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        maxSum=Math.max(maxSum,leftSum);
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[rightIndex];
            rightIndex--;
            maxSum=Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}