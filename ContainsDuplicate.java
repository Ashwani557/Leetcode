import java.util.*;

public class ContainsDuplicate {

    
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);   // sort the array

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }
}
