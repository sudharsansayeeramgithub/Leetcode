class Solution {
    public String fractionAddition(String expression) {
        //split the expression into fraction
        List<String> fractions=new ArrayList<>();
        int i=0,n=expression.length();
        while(i<n){
            int start=i;
            if(expression.charAt(i)=='+'||expression.charAt(i)=='-'){
                i++;
            }
            while(i<n&&expression.charAt(i)!='+'&&expression.charAt(i)!='-'){
                i++;
            }
            fractions.add(expression.substring(start,i));
        }
        //Initialize the result as the first fraction
        String[] firstFraction=fractions.get(0).split("/");
        int totalNumerator=Integer.parseInt(firstFraction[0]);
        int totalDenominator=Integer.parseInt(firstFraction[1]);
        //Add fraction one by one
        for(int j=1;j<fractions.size();j++){
            String[] parts=fractions.get(j).split("/");
            int numerator=Integer.parseInt(parts[0]);
            int denominator=Integer.parseInt(parts[1]);
            //Calculate the new numerator and denominator
            totalNumerator=totalNumerator*denominator+numerator*totalDenominator;
            totalDenominator=totalDenominator*denominator;
            //Simplify the fraction using GCD
            int commonDivisor=gcd(Math.abs(totalNumerator),totalDenominator);
            totalNumerator/=commonDivisor;
            totalDenominator/=commonDivisor;
       }
       return totalNumerator+"/"+totalDenominator;
    }
    private int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}