class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        StringBuilder complement=new StringBuilder();
        for(int i=0;i<binary.length();i++){
            complement.append(binary.charAt(i)=='0' ? '1': '0');
        }
        return Integer.parseInt(complement.toString(),2);
    }
}