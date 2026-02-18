import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("false");
        }
        while(n%2==0){
            n = n/2;
        }
        // if(n==1){
            System.out.println(n==1);
        // }

    }
    
}


// same theory for power of 3,4