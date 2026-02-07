
import java.util.Scanner;

public class DivideTwoInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        if((d2 ==-1 )&& (d1 == Integer.MIN_VALUE)){
            System.out.println(Integer.MAX_VALUE);

        }
        System.out.println((d1/d2));

        
    }
    
}
