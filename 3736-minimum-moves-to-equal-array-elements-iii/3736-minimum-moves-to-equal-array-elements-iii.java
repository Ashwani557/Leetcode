class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int j = 0; j < nums.length; j++) {
            result += max - nums[j];
        }

        return result;
    }
}