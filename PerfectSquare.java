
import java.util.*;

public class PerfectSquare {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();

        double z = Math.floor(Math.sqrt(n));

        System.out.println(z*z == n);



    }
    
}
// binary search approach

    // public boolean isPerfectSquare(int num) {
    //     long left = 1, right = num;

    //     while (left <= right) {
    //         long mid = left + (right - left) / 2;
    //         long square = mid * mid;

    //         if (square == num) return true;
    //         else if (square < num) left = mid + 1;
    //         else right = mid - 1;
    //     }

    //     return false;
    // }

