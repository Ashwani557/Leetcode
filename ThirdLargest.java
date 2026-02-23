import java.util.*;
public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        int [] nums = new int[n];
        for(int i = 0 ; i<nums.length;i++){
            nums[i]= sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i]>second && nums[i] != first){
                third = second;
                second = nums[i];
            }
            else if(nums[i]>third && nums[i]!=second && nums[i]!= first){
                third = nums[i];
            }
        }
            if(third == Integer.MIN_VALUE) {
            System.out.println("No 3 largest element in thiss array");
        } else {
            System.out.println(third);
        }

    }
    
}
