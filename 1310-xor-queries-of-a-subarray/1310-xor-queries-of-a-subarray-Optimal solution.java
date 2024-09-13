class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result=new int[queries.length];
        int[] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]^arr[i];
        }
        for(int i=0;i<queries.length;i++){
            int one=queries[i][0];
            int two=queries[i][1];
            if(one==0){
                result[i]=prefix[two];
            }else{
                result[i]=prefix[two]^prefix[one-1];
            }
        }
        return result;
    }
}