class majorityElement {
    public int majorityEleme(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;   // choose new candidate
            }

            if (num == candidate) {
                count++;           // vote for candidate
            } else {
                count--;           // cancel vote
            }
        }

        return candidate;
    }
}
