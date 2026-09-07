class Solution {
    public int countGoodSubstrings(String s) {
        int low =0;
        int high =2;
        int n = s.length();
        int count =0;
        while(high<n){
            if(s.charAt(low)!=s.charAt(low+1)  && s.charAt(low+1)!=s.charAt(high)  && s.charAt(low)!=s.charAt(high)){
                count++;

            }
            low++;
            high++;
        }
        return count;
        
    }
}