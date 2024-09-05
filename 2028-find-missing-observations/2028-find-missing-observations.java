class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int total=mean*(rolls.length+n);
        int sum=0;
        for(int i:rolls){
            sum+=i;
        }
        int missing=total-sum;
        System.out.println(missing);
        if(missing>n*6){
            return new int[] {};
        }
        int quotient=missing/n;
        int remainder=missing%n;
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=quotient;
        }
        for(int i=0;i<remainder;i++){
            result[i]++;
        }
        return result;
    }
}