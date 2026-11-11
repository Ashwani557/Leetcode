class Solution {
    String s;
    long[] pref;
    int enc, flat;

    public long minCost(String s, int enc, int flat) {
        this.s = s;
        this.enc = enc;
        this.flat = flat;

        int n = s.length();
        pref = new long[n+1];

        long c = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') c++;
            pref[i+1] = c;
        }

        if(n%2==1){
            if(c==0) return flat;
            else return (long)n*c*enc;
        }

        return f(0,n-1);
    }

    long f(int l,int r){
        long len = r-l+1;
        long sensi = pref[r+1]-pref[l];

        if(len%2==1){
            if(sensi==0) return flat;
            return len*sensi*enc;
        }

        long ans;
        if(sensi==0) ans = flat;
        else ans = len*sensi*enc;

        int mid = (l+r)/2;
        return Math.min(ans, f(l,mid)+f(mid+1,r));
    }
}