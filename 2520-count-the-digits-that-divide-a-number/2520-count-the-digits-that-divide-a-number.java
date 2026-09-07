class Solution {
    public int countDigits(int num) {
        int count =0;
        int org = num;
        while(num>0){
            int k = num%10;
            if(org%k==0){
                count++;
            }
                num/=10;
        }
        return count;
        
    }
}