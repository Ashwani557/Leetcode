class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxtill= -1;
        int cand =0;
        int max =0;

      for(int i =0;i<nums.length;i++){
        maxtill= Math.max(maxtill,nums[i]);
        if(i==cand){
            max = maxtill;

        }
        if(nums[i]<max-k){
            cand=i+1;
        }

      }  
      return cand <nums.length ? cand : -1;
    }
}