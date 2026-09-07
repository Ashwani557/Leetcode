class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        int m = buses.length;
        int n = passengers.length;

        Arrays.sort(buses);
        Arrays.sort(passengers);
        Set<Integer> set = new HashSet<>();
        int c=0,ans=0;
        for(int i=0;i<m;i++)
            {
                int k = capacity;
                for(int j=c;j<n;j++)
                    {
                        set.add(passengers[j]);
                        if(passengers[j]<=buses[i])
                        {
                            if(j==n-1)
                            {
                                ans = buses[m-1];
                                while(set.contains(ans))
                                    {
                                        ans--;
                                    }
                            }
                            if(k==1 && i==m-1)
                            {
                                
                                ans=passengers[j]-1;
                                while(set.contains(ans))
                                    {
                                        ans--;
                                    }
                            }
                            c++;
                            k--;
                        }
                        else 
                        {
                            if(i==m-1)
                            {
                                ans=buses[i];
                                while(set.contains(ans))
                                    {
                                        ans--;
                                    }
                            }
                            break;
                        }
                        if(k==0)break;
                        
                    }
            }
        return ans;
    }
}