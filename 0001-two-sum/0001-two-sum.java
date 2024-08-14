class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> IndexMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int requirednumber=target-nums[i];
            if(IndexMap.containsKey(requirednumber)){
                int toReturn[] = {IndexMap.get(requirednumber), i};
                return toReturn;
            }

            IndexMap.put(nums[i], i);
        }
        return null;
            }
        }