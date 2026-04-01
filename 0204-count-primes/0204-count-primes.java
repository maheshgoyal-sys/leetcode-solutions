class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean prime[] = new boolean[n+1];
        for(int i=2;i<n;i++){
            prime[i]=true;
        }
        for(int i=2;i<n;i++){
            if(prime[i]){
                for(int j=2*i;j<n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i])    c++;
            
        }
        return c;
    }
}