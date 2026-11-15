class Solution {
    public int numOfSubarrays(int[] arr) {
      
        int MOD = 1_000_000_007;
        int count = 0, even = 1, odd = 0, sum = 0;
        int n = arr.length;
        for(int i=0;i<n; i++)
        {
            sum +=arr[i];
            if(sum%2==0)
            {
                count = (count+odd)%MOD;
                even++;
            }else
            {
                count = (count+even)%MOD;
                odd++;
            }
        } 
        return count;
    }
}