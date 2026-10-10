class Solution {
    public int maximumCount(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        int p = nums.length;
        int n = nums.length;

        // Find first positive number
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > 0) {
                p = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int pcount = nums.length - p;

        low = 0;
        high = nums.length - 1;

        // Find first non-negative number
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= 0) {
                n = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int ncount = n;

        return Math.max(pcount, ncount);
    }
}