class Solution {
    public int countCommas(int n) {
        int c=0;
        String s=Integer.toString(n);
        if(s.length()<4){
            return 0;
        }
        else{
            return n-1000+1;
        }
    }
}