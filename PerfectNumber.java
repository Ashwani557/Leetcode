public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i<num;i++){
            int n = num%i;
            if(n==0){
                sum+=i;
            }

        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
        
    }
}