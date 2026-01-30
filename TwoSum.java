import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

    
        int[] result = twoSum(arr, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        } else {
            System.out.println("No two sum solution found");
        }

        sc.close();
    }


    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; 
    }
}
