
import java.util.Scanner;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int currsum = arr[0];
        int maxsum = arr[0];
         for(int i = 1;i <arr.length;i++){
            currsum = Math.max(arr[i],(currsum+arr[i]));
            maxsum = Math.max(currsum,maxsum );


         }
         System.out.println(maxsum);

    }
    
}
