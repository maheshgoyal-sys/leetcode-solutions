class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int c=0;
        int cr = 0,cl=0;
        for(char ch : moves.toCharArray()){
            if(ch=='R')cr++;
            else if(ch=='L') cl++;
        }
        boolean right=false,left=false;
        if(cr>cl){
            right=true;
        }
        else left=true;
        if(right){
            for(char ch : moves.toCharArray()){
                if(ch=='R' || ch=='_')  c++;
                else c--;
            }
        }
        else{
            for(char ch : moves.toCharArray()){
                if(ch=='L' || ch=='_')  c++;
                else c--;
            }
        }
        return c;
    }
}