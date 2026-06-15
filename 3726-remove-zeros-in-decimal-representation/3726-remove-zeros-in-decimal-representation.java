class Solution {
    public long removeZeros(long n) {
        long ans = 0;
        String s = "";
        while(n>0){
            long rem = n%10;
            if(rem!=0){
                s+=rem;
            }
            n=n/10;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return Long.parseLong(sb.toString());
    }
}