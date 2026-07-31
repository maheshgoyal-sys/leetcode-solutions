class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=Integer.MAX_VALUE,
        min2=Integer.MAX_VALUE;
        for(int i : prices){
            if(i<min1){
                min2=min1;
                min1=Math.min(i,min1);
            }
            else if(i<min2){
            min2=Math.min(i,min2);
            }
        }
        if(min1+min2<=money){
            return money-(min1+min2);
        }
        return money;
    }
}
// 1 2 2 min1=1 min2