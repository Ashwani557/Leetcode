// class Solution {
//     public String triangleType(int[] nums) {
//         for(int i =1; i<nums.length;i++){
//             if(nums[i]==nums[i+1]    && nums[i]==nums[i-1]){
//                 return "equilateral";
//             }
//             else if (nums[i]!=nums[i+1]  && nums[i]!=nums[i-1]){
//                 return "scalene";
//             }
//         }
//         return "isosceles";
        
//     }
// }
class Solution {
    public String triangleType(int[] nums) {

        // Check if it is a valid triangle
        if (nums[0] + nums[1] <= nums[2] ||
            nums[0] + nums[2] <= nums[1] ||
            nums[1] + nums[2] <= nums[0]) {
            return "none";
        }

        // All three sides equal
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }

        // Any two sides equal
        if (nums[0] == nums[1] ||
            nums[1] == nums[2] ||
            nums[0] == nums[2]) {
            return "isosceles";
        }

        // All sides different
        return "scalene";
    }
}