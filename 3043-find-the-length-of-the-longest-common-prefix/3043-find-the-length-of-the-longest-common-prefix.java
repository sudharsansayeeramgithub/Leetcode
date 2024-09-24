class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> prefix=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            String s=String.valueOf(arr1[i]);
            for(int j=1;j<=s.length();j++){
                prefix.add(s.substring(0,j));
            }
        }
        String result=new String();
        for(int i=0;i<arr2.length;i++){
            String s1=String.valueOf(arr2[i]);
            for(int j=1;j<=s1.length();j++){
                String currentprefix=s1.substring(0,j);
                if(prefix.contains(currentprefix)){
                    if(currentprefix.length()>result.length()){
                        result=currentprefix;
                    }
                }else{
                    break;
                }
            }
        }
        return result.length();
    }
}