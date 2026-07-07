class Solution {
    public long sumAndMultiply(int n) {
        int temp=n;
        long sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        String str = Integer.toString(temp);
        String ans="";
        for(char ch : str.toCharArray()){
            if(ch!='0'){
                ans+=ch;
            }
        }
        if(ans.length()==0) return 0;
        long nu = Long.parseLong(ans);
        return nu*sum;
    }
}