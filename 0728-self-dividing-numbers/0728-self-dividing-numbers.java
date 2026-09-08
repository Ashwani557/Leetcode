class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            int temp = i;
            boolean valid = true;

            while (temp > 0) {
                int m = temp % 10;

                if (m == 0 || i % m != 0) {
                    valid = false;
                    break;
                }

                temp /= 10;
            }

            if (valid) {
                ans.add(i);
            }
        }

        return ans;
    }
}