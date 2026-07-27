// class Solution {
//     public int maxProduct(int[] nums) {
//         int res= 0;
//         int max = 0;
//         // int sol =0;
//         for(int i =0; i<nums.length;i++){
//             for(int j =i+1;j<nums.length;j++){
//                 res = (nums[i]-1)*(nums[j]-1);
//                max= Math.max(res,max);

//             }
//         }
//         return max;
        
//     }
// }


class Solution {
    public int maxProduct(int[] nums) {
        int largest = 0;
        int secondLargest = 0;

        for(int num : nums) {
            if(num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                // there is no element > largest than update secondLargest
                secondLargest = num;
            }
        }

        return (largest - 1) * (secondLargest - 1);
    }
}