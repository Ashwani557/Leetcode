import java.util.*;
public class MoveZero1s {
    
    public void moveZeroes(int[] nums) {
        int a = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[a];
                nums[a] = temp;
                a++;
            }
        }
        System.out.println(Arrays.toString(nums));


        
        
    }
}

    

