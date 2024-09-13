class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int one=queries[i][0];
            int two=queries[i][1];
            for(int j=one;j<=two;j++){
                result[i]^=arr[j];
            }
        }
        return result;
    }
}