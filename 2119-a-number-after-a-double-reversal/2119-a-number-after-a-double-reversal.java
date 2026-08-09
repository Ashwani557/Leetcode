class Solution {

    public boolean isSameAfterReversals(int num) {

        // Reverse the original number once.
        int reversedNumber = reverseNumber(num);

        // Reverse it again and check whether
        // we get back the original number.
        return num == reverseNumber(reversedNumber);
    }

    private int reverseNumber(int num) {

        // Stores the reversed form of the number.
        int reversedNumber = 0;

        while (num > 0) {

            // Extract the last digit and append it
            // to the reversed number.
            reversedNumber = reversedNumber * 10 + num % 10;

            // Remove the last digit.
            num /= 10;
        }

        return reversedNumber;
    }
}