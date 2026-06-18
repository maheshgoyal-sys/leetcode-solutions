class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int c=0,j=0,i=0;
        while(j<nums.length){
            if(nums[i]<nums[j]){
                c++;
                i++;
            }
            j++;
        }
    return c;
    }
}
// [1,3,5,2,1,3,1]
// 1 1 1 2 3 3 5
// i  3  i
// j      j
  