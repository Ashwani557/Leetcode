
import java.util.Scanner;

public class powerofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println(false);
        }
        else if(n%2==0){
            n = n/2;
        }
        System.out.println(true);
       
    }

}
