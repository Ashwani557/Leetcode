class Solution {
    public boolean checkDivisibility(int n) {
        int k =n;
        int digitsum=0;
        int digitprod =1;
        while(n>0){
            int m = n%10;
            digitsum+=m;
            digitprod*=m;
            n=n/10;
        }
        int sol=digitsum+digitprod;
        return k%sol==0;

    }
}