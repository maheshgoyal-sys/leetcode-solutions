class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int e[] : tasks){
            int s = e[0];
            int end = e[1];
            min=Math.min(min,s+end);
        }
        return min;
    }
}