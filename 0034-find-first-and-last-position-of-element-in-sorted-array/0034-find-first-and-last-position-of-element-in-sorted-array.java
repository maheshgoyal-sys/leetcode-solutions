class Solution {
    public static int first(int nums[],int target){
        int l = 0,r = nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]==target){
                ans=mid;
                r=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
    public static int last(int nums[],int target){
        int l = 0,r = nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]==target){
                l=mid+1;
                ans=mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        Arrays.fill(ans,-1);
        ans[0] = first(nums,target);
        ans[1] = last(nums,target);
        return ans;
    }
}