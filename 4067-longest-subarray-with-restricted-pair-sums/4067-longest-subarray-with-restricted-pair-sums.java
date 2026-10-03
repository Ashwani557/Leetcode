class Solution {

    private boolean isInValid(int[] hash, int x) {
        for(int a = 0; a <= 500; a++) {
            if(hash[a] == 0) continue;
            int b = x - a;
            if(b >= 0 && b <= 500) {
                if(b == a && hash[b] > 1) return true;
                if(b != a && hash[b] > 0) return true;
            }
            b = x + a;
            if(b >= 0 && b <= 500) {
                if(hash[b] > 0) return true;
            }
        }

        return false;
    }

    public int maxSubarray(int[] nums) {
        int r = 0, l = 0;
        int n = nums.length;
        int max = 0;
        int[] hash = new int[501];

        while(r < n) {
            int x = nums[r];
            while(l < r && isInValid(hash, x)) {
                hash[nums[l]]--;
                l++;
            }

            max = Math.max(max, r - l + 1);
            hash[nums[r]]++;
            r++;
        }

        return max;
    }
}