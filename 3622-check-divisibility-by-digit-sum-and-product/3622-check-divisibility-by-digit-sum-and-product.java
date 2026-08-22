class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int s=0,p=1;
        while(n>0){
            int rem = n%10;
            s+=rem;
            p*=rem;
            n/=10;
        }
        return temp%(s+p)==0;
    }
}