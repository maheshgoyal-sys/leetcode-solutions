class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        // Arrays.sort(grid, (a, b) -> Integer.compare(a[0] - a[1], b[0] - b[1]));
        for(int i=0;i<n;i++){
            Arrays.sort(grid[i]);
        }
        // 1 2 4
        // 1 3 4
        int ans=0;
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
                max=Math.max(grid[j][i],max);
            }
            ans+=max;
        }
        return ans;
    }
}