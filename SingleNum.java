import java.util.*;

class SingleNum {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 1; i += 2){
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        
        return nums[nums.length - 1];
    }
}


// class Solution {
//     public int singleNumber(int[] nums) {
//         int ans = 0;
        
//         for(int num : nums){
//             ans ^= num;   // XOR
//         }
        
//         return ans;
//     }
// }
