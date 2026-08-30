class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex=0,maxIndex=0;
        int max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
            else if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        
        minIndex+=1;
        maxIndex+=1;
        
        int n = nums.length;
        if(maxIndex<minIndex){
            int temp=maxIndex;
            maxIndex=minIndex;
            minIndex=temp;
        }
        int left=maxIndex;
        int right = n-minIndex+1;
        int mid = (minIndex)+(n-maxIndex+1);
        return Math.min(left,Math.min(right,mid));
    }
}