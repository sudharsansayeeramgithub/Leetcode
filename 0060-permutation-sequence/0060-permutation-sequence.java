class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder result=new StringBuilder();
        kthpermutation(n,new int[]{k},new boolean[n],result,new StringBuilder());
        return result.toString();
    }
    public void kthpermutation(int n,int[] k,boolean[] freq,StringBuilder result,StringBuilder permutation){
        if(permutation.length()==n){
            k[0]--;
            if(k[0]==0){
                result.append(permutation.toString());
            }
            return;
            //permutation.setLength(0);
        }
        for(int i=1;i<=n;i++){
            if(!freq[i-1]){
                freq[i-1]=true;
                permutation.append(String.valueOf(i));
                kthpermutation(n,k,freq,result,permutation);
                freq[i-1]=false;
                permutation.deleteCharAt(permutation.length()-1);
            }
        }
    }
}