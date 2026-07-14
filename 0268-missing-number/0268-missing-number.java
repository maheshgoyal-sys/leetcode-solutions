class Solution {
    public int missingNumber(int[] nums) {
        int s=0,m=0,z=0;

        for(int i : nums){
            s+=i;
            m=Math.max(m,i);
            if(i == 0) z++;
        }

        int total = (m*(m+1)/2);

        if(total-s == 0) {
            if(z > 0) return m+1;
            else return 0;
        }
        else return total-s;
        
    }
}