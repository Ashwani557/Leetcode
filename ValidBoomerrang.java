
import java.util.Scanner;

public class ValidBoomerrang {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [][] arr= new int[3][2];

        

        for(int i =0; i < 3; i++){
            for (int j = 0; j<2; j++){

                arr[i][j] = sc.nextInt();

            
                
            }


        }
        boolean formula = ((arr[1][1])-(arr[0][1]))*((arr[2][0]-arr[1][0])) != ((arr[2][1])-(arr[1][1]))*((arr[1][0])-(arr[0][0]));



        System.out.println(formula);

        
    

    }
    
}
