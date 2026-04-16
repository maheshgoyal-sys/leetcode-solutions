class Solution {
    public static boolean helper(int position[],int m,int mid){
        int count=1;
        int last = position[0];
        for(int i=0;i<position.length;i++){
            if(position[i] - last >= mid){
                last=position[i];
                count++;
            }
        }
        return count>=m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1] - position[0];
        int ans = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(helper(position,m,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}