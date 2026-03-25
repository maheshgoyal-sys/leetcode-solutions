class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // 1. Compute total sum of grid
        long totalSum = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                totalSum += grid[i][j];
            }
        }

        // 2. Try horizontal cut
        long rowSum = 0;
        for(int i = 0; i < m - 1; i++){ // cut must leave two non-empty sections
            long sumRow = 0;
            for(int j = 0; j < n; j++){
                sumRow += grid[i][j];
            }
            rowSum += sumRow;
            if(rowSum * 2 == totalSum) return true;
        }

        // 3. Try vertical cut
        long[] colSums = new long[n];
        for(int j = 0; j < n; j++){
            for(int i = 0; i < m; i++){
                colSums[j] += grid[i][j];
            }
        }

        long colSum = 0;
        for(int j = 0; j < n - 1; j++){
            colSum += colSums[j];
            if(colSum * 2 == totalSum) return true;
        }

        return false;
    }
}