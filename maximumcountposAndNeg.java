
public class maximumcountposAndNeg {
    
    public int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;

        for(int i = 0; i<= nums.length -1 ;i++){
            if(nums[i]>0){
                positive ++;
            }
            else if(nums[i]<0){
                negative ++;
            }
        }
       return Math.max(positive,negative);

        
    }
}
    
//only for leetcode
