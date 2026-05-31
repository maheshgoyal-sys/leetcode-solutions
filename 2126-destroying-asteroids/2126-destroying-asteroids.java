class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long sum = mass;
        if(asteroids.length==1){
            if(mass>=asteroids[0])  return true;
            return false;
        }
        if(mass==1 && asteroids[0]==asteroids[1] && asteroids.length==2)   return false;
        Arrays.sort(asteroids);
        boolean ans=true;
        for(int i=1;i<asteroids.length;i++){
            sum+=asteroids[i-1];
            if(sum>=asteroids[i]){
                continue;
            }
            else{
                  ans=false;          
                break;      // 4 4 9 23  s=5
                      //     
            }
        }
        return ans;
    }
}