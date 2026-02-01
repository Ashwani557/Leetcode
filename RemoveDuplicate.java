import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements (SORTED)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create object
        RemoveDuplicate obj = new RemoveDuplicate();

        // Remove duplicates
        int k = obj.removeDuplicates(arr);

        // Output
        System.out.println("The new length is: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
