import java.util.Scanner;

public class movezeros {
      public static void movezero(int[] nums) {
            int i = 0;
            for (int j : nums) {
                  if (j != 0) {
                        nums[i++] = j;
                  }
            }
            while (i < nums.length) {
                  nums[i++] = 0;
            }
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                  nums[i] = sc.nextInt();
            }
            movezero(nums);
            for (int i : nums) {
                  System.out.println(i);
            }
      }
}