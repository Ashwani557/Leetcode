import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);

        int ans = -1;
        int count = 1;

        for (int i = 1; i <= arr.length; i++) {
            if (i < arr.length && arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (count == arr[i - 1]) {
                    ans = arr[i - 1];
                }
                count = 1;
            }
        }

        return ans;
    }
}