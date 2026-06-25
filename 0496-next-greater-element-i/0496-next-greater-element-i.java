class Solution {
    public static int helper(int t,int nums2[]){
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==t) return i;
            }
            return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int t = nums1[i];
            boolean flag=false;
            int idx = helper(t,nums2);
            for(int j=idx+1;j<nums2.length;j++){
                if(nums2[j]>t){
                    flag=true;
                    ans[i]=nums2[j];
                    break;
                }  
            }
            if(!flag)
            ans[i]=-1;
        }
        return ans;
    }
}