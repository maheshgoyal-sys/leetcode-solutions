class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long sum=mass;
        Arrays.sort(asteroids);
        boolean ans=true;
        for(int i : asteroids){
            if(sum<i){
                ans=false;
            }
            sum+=i;
        }
        return ans;
    }
}