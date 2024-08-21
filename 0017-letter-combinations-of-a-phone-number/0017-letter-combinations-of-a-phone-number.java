class Solution {
    public String[] digitstoletter={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        List<String> result=new ArrayList<>();
        Combinations(0,result,digits,new StringBuilder());
        return result;
    }
    public void Combinations(int i,List<String> result,String digits,StringBuilder current){
        if(i==digits.length()){
            result.add(current.toString());
            return;
        }
        for(char c:digitstoletter[digits.charAt(i)-'0'-2].toCharArray()){
            current.append(c);
            Combinations(i+1,result,digits,current);
            current.deleteCharAt(current.length()-1);
        }

    }
}