import java.util.Scanner;

public class AddDigits{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();

        while (digit >= 10) {   // repeat until single digit
            
            int d1 = digit / 10;
            int d2 = digit % 10;
            int sum = d1 + d2;

            if (sum >= 10) {
                int sum2 = sum / 10;
                int sum3 = sum % 10;
                digit = sum2 + sum3;   // update digit
            }
            else {
                digit = sum;           // update digit
            }
        }

        System.out.println(digit);
    }
}





// class Solution {
//     public int addDigits(int num) {
//         if(num == 0) return 0;
//         return 1 + (num - 1) % 9;
//     }
// }

