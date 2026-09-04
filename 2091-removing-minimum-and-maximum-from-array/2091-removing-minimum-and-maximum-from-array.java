class Solution {
    public int minimumDeletions(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        int minIndex = 0;
        int maxIndex = 0;

        // Find minimum, maximum and their indexes
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Find the smaller and larger index
        int a = Math.min(minIndex, maxIndex);
        int b = Math.max(minIndex, maxIndex);

        // Delete both from left
        int left = b + 1;

        // Delete both from right
        int right = nums.length - a;

        // Delete one from left and one from right
        int both = (a + 1) + (nums.length - b);

        return Math.min(left, Math.min(right, both));
    }
}