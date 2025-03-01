class Solution {
    public int[] applyOperations(int[] nums) {
        // First pass: merge identical adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Second pass: move non-zero elements to the front
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the rest with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }

        return nums;
    }
}
