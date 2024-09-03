class Solution {
    public int getLucky(String s, int k) {
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            str.append(ch-'a'+1);
        }
        while(k>0){
            int temp=0;
            for(char ch:str.toString().toCharArray()){
                temp+=ch-'0';
            }
            str = new StringBuilder(String.valueOf(temp));
            k--; 
        }
        return Integer.parseInt(str.toString());
    }
}