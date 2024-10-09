class Solution {
    public int minAddToMakeValid(String s) {
        int count=0,negative=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
                negative++;
                count=0;
            }
        }
        return count+negative;
    }
}