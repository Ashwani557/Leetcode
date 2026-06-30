// class Solution {
//     public int findNonMinOrMax(int[] nums) {
//         Arrays.sort(nums);
//         if(nums.length<=2){
//             return -1;
//         }
//         return nums[1];
        
//     }
// }
class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=min && nums[i]!=max)
            {
                return nums[i];
            }
        }
        return -1;
    }
}