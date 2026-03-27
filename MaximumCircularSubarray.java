import java.util.Scanner;

public class MaximumCircularSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int total = 0;
        int maxSum = arr[0], currMax = 0;
        int minSum = arr[0], currMin = 0;

        for(int x : arr){
            currMax = Math.max(x, currMax + x);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(x, currMin + x);
            minSum = Math.min(minSum, currMin);

            total += x;
        }

        if(maxSum < 0) {
            System.out.println(""+maxSum);
        }

        System.out.println(Math.max(maxSum, total - minSum)); 

       

            
        }

    }
    

