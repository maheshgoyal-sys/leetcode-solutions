class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int arr[] = new int[1001];
        for(int i=0;i<trips.length;i++){
            int idx = trips[i][1];
            int val = trips[i][0];
            int id = trips[i][2];
            

            arr[idx] += val;
            arr[id] += -val;
            
        }
        int currsum=0;
        for(int i=0;i<arr.length;i++){
                currsum+=arr[i];
                if(currsum>capacity)    return false;
        }
        return true;
    }
}