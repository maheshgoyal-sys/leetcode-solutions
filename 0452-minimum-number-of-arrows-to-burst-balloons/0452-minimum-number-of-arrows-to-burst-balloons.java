class Solution {
    public int findMinArrowShots(int[][] points) {
        int c=1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int prevend = points[0][1];
        for(int i=1;i<points.length;i++){
            int currstart = points[i][0];
            if(prevend<currstart){
                c++;
                prevend=points[i][1];
            }
        }
        return c;
    }
}