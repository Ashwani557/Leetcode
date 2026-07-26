// class Solution {
//     public int maximumProduct(int[] nums) {
//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i < nums.length; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 for(int k = j + 1; k < nums.length; k++){
//                     max = Math.max(max, nums[i] * nums[j] * nums[k]);
//                 }
//             }
//         }

//         return max;
//     }
// }
class Solution {
    public int maximumProduct(int[] nums){
        int n = nums.length;

        Arrays.sort(nums);

        int poss1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int poss2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(poss1, poss2);
    }
}