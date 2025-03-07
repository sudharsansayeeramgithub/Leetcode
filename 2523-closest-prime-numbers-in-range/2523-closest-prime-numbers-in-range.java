class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] result=new int[]{-1,-1};
        boolean[] isPrime=new boolean[right+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=right;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=right;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        int first=-1,second=-1,prevPrime=-1;
        for(int i=left;i<=right;i++){
            if(isPrime[i]){
                if(prevPrime==-1){
                    prevPrime=i;
                }
                else{
                    if(result[0]==-1||(i-prevPrime)<(result[1]-result[0])){
                        result[0]=prevPrime;
                        result[1]=i;
                    }
                    prevPrime=i;
                }
            }
        }
        return result;
    }
}