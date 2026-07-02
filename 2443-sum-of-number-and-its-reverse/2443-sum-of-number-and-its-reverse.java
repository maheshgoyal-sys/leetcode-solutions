class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            
            StringBuilder sb = new StringBuilder(""+i);
            String str=sb.reverse().toString();
            int n=Integer.parseInt(str);
            if(n+i==num)    return true;
        }
        return false;
    }
}