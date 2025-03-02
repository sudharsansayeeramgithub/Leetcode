class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> res=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            res.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            res.put(nums2[i][0],res.getOrDefault(nums2[i][0],0)+nums2[i][1]);
        }
        int[][] result=new int[res.size()][2];
        int index=0;
        for(Map.Entry<Integer,Integer> it:res.entrySet()){
            result[index][0]=it.getKey();
            result[index][1]=it.getValue();
            index++;
        }
        Arrays.sort(result,Comparator.comparingInt(a->a[0]));
        return result;
    }
}