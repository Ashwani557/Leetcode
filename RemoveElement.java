import java.util.*;


public class RemoveElement {
    public static int removeElement(int[] arr , int val){
        int k = 0;
        for (int i = 0; i <arr.length; i ++){
            if (arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0; i < n; i++){
           
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int k = removeElement(arr , val);
        System.out.println("The new length is: " + k);
        for (int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }





         
    }



}
