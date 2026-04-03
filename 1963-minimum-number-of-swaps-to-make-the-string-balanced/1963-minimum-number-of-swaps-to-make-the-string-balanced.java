class Solution {
    public int minSwaps(String s) {
        int bal = 0;
        int inbal = 0;
        for(char ch : s.toCharArray()){
            if(ch=='['){
                bal++;
            }
            else{
                bal--;
            }
            if(bal<0){
                bal=0;
                inbal++;
            }
        }
        return (inbal+1)/2;
    }
}