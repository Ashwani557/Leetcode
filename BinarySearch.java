import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i<n; i++){
                 arr[i] = sc.nextInt();
        }

        
    
        int left = 0;
        int right = (arr.length - 1);
        int target = sc.nextInt();

         int mid = left + ((right - left)/2);    
 
        while (left <= right){

            
     
        if(arr[mid] ==  target){
            System.out.println(mid);
            break;

        }
        else if (arr[mid] > target){
            right = mid-1;
      

            
        }
        else if (arr[mid] < target){
            left = mid + 1;
        }

        else {
        System.out.println("not found");
        }



    }




}
    
}
