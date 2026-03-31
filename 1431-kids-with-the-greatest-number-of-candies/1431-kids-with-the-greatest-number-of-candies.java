class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int i : candies){
            max=Math.max(max,i);
        }

        for(int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
                // max = candies[i]+extraCandies;
            }
            else     ans.add(false);
        }
        return ans;
    }
}