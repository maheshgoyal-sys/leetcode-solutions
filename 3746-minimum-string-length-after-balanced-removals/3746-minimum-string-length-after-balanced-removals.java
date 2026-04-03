class Solution {
    public int minLengthAfterRemovals(String s) {
        int ca=0;
        int cb=0;
        for(char ch : s.toCharArray()){
            if(ch=='a') ca++;
            else cb++;
        }
        return Math.abs(ca-cb);
    }
}