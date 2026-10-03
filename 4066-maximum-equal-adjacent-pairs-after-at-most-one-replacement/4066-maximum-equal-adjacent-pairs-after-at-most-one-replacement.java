class Solution {
    public int maxEqualAdjacentPairs(int[] nums) {
        int base = 0, gain = 0;
        Map<Long, Integer> cnt = new HashMap<>();  // key: unordered pair {a, b}
        for (int i = 1; i < nums.length; i++) {
            int a = Math.min(nums[i - 1], nums[i]), b = Math.max(nums[i - 1], nums[i]);
            if (a == b) base++;
            else gain = Math.max(gain, cnt.merge((long) a << 32 | b, 1, Integer::sum));
        }
        return base + gain;
    }
}