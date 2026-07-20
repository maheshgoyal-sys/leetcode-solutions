class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;
        k = k % total;

        int[][] ans = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                int index = i * n + j;

                int newIndex = (index + k) % total;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                ans[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < m; i++){
            List<Integer> temp = new ArrayList<>();

            for(int j = 0; j < n; j++){
                temp.add(ans[i][j]);
            }

            list.add(temp);
        }

        return list;
    }
}