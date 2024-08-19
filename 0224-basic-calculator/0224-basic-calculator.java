class Solution {
    public int calculate(String s) {
        Stack<Integer> operations=new Stack<>();
        int result=0,number=0,sign=1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                number=number*10+(ch-'0');
            }else if(ch=='+'){
                result+=sign*number;
                number=0;
                sign=1;
            }else if(ch=='-'){
                result+=sign*number;
                number=0;
                sign=-1;
            }else if(ch=='('){
                operations.push(result);
                operations.push(sign);
                sign=1;
                result=0;
            }
            else if(ch==')'){
                result+=sign*number;
                number=0;
                result*=operations.pop();
                result+=operations.pop();
            }
        }
        if(number!=0) result+=sign*number;
        return result;
    }
}