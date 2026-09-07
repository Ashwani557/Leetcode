class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int n = buses.length;
        int m = passengers.length;
        int i = 0;
        int ct=0;
    
       for(int bus : buses){
            ct=0;
            while(i<m && passengers[i]<=bus && ct<capacity){
                i++;
                ct++;
            }
       }
       
       int ans;

       
       if(ct<capacity){
        ans=buses[n-1];
       }
       //last bus became full]
       else{
        ans=passengers[i-1];
       }
       i--;
       while(i>=0 && passengers[i]==ans){
        ans--;
        i--;
       }
       return ans;
    }
}