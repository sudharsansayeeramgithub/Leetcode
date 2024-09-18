class Solution {
    public String largestNumber(int[] nums) {
        String[] string=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            string[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(string,(a,b)->(b+a).compareTo(a+b));
        StringBuilder result=new StringBuilder();
        for(String str:string){
            result.append(str);
        }
        return result.charAt(0)=='0' ? "0": result.toString();
    }
}