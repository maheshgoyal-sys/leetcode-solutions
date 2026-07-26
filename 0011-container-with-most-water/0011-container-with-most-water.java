class Solution {
    public int maxArea(int[] heights) {
         int ans=0,l=0,h=heights.length-1;
        while(l<h){
            int width=Math.min(heights[l],heights[h]);
            int area = width * (h-l);
            ans=Math.max(area,ans);
            if(heights[l]<heights[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return ans;
    }
}