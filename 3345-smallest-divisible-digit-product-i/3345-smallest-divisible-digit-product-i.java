class Solution {
    public static int helper(int num){
        int p = 1;
        while(num>0){
            int rem=num%10;
            p=p*rem;
            num=num/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        boolean flag = false;int ans=0;
        while(n<=100){
            ans = helper(n);
            if(ans%t==0){
                break;
            }
            n++;
        }
        return n;
    }
}