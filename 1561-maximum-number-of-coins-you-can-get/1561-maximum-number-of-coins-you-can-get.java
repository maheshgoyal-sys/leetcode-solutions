class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int bob = 0,alice =piles.length-1,ans=piles.length-2,ans1=0;
        while(bob<ans){
            ans1+=piles[ans];
            bob++;
            alice-=2;
            ans-=2;
        }
        return ans1;
    }
}