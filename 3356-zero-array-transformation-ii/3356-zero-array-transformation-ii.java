class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int operationCount=0;
        boolean isZeroArray=true;
            for(int num:nums){
                if(num!=0){
                    isZeroArray=false;
                    break;
                }
            }
            if(isZeroArray){
                return operationCount;
            }
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0],r=queries[i][1],val=queries[i][2];
            for(int j=l;j<=r;j++){
                nums[j]=Math.max(0,nums[j]-val);
            }
            operationCount++;
            isZeroArray=true;
            for(int num:nums){
                if(num!=0){
                    isZeroArray=false;
                    break;
                }
            }
            if(isZeroArray){
                return operationCount;
            }
        }
        return -1;
    }
}