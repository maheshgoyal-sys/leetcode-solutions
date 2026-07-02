class Solution {
    public long[] sumOfThree(long num) {
        long ans[] = new long[3];
        long temp = num/3;
        ans[0]=temp-1;
        ans[1]=temp;
        ans[2]=temp+1;
        long s=0;
        for(long i : ans){
            s+=i;
        }
        if(s==num) return ans;
        return new long[]{};
    }
}