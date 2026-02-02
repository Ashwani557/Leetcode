import java.util.*;

public class MinimumCost {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int a = arr[0];
        Arrays.sort(arr,1,arr.length);

        int sum = a + arr[1] + arr[2];

        System.out.println(sum);

    



    }
}
