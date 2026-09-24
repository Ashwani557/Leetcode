class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int fsum =0;
            
            int n = nums[i];
            while(n>0){
                int m = n%10;
                 fsum+=m;
                n=n/10;
                }
                if(fsum==i){
                    return i;
            }
        }return -1;
    }
}