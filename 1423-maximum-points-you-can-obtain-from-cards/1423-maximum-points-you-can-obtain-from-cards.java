class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int sum = 0;

        // Take all k cards from the left initially
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int max = sum;

        // Remove cards from left and take from right
        for (int i = 0; i < k; i++) {
            sum -= cardPoints[k - 1 - i];
            sum += cardPoints[n - 1 - i];

            max = Math.max(max, sum);
        }

        return max;
    }
}