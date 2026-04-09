class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
    //    [[1,3],[2,2],[3,1]]
    // 1,3  2 , 2  3, 1   4

        int ans=0;
        Arrays.sort(boxTypes,(a,b)-> b[1] - a[1]);
        for(int e[] : boxTypes){
            int a=e[0];
            int b=e[1];
            if((truckSize - a) >=0){
                truckSize-=a;
                ans+=a*b;
            }
            else{
                // a-=truckSize;
                ans+=truckSize*b;
                break;
            }
        }
        return ans;
    }
}