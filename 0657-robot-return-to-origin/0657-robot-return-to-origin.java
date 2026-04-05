class Solution {
    public boolean judgeCircle(String moves) {
        int pos = 0;
        int po = 0;
        for(char ch : moves.toCharArray()){
            if(ch=='U'){
                pos++;
            }
            else if(ch=='D')    pos--;
            else if(ch=='L')    po--;
            else
            po++;
        }
        return pos==0 && po==0;
    }
}