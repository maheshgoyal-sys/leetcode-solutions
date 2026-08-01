class Solution {

    public static boolean helper(int nums[],int left,int right,int p1,int p2,boolean turn){
        if(left>right){
            return p1>=p2;
        }
        if(turn){
        boolean l = helper(nums,left+1,right,p1+nums[left],p2,false);
        boolean r = helper(nums,left,right-1,p1+nums[right],p2,false);
        return l|| r;
        }
        else{
        boolean l = helper(nums,left+1,right,p1,p2+nums[left],true);
        boolean r =helper(nums,left,right-1,p1,p2+nums[right],true);
        return l && r;
        }
        
    }
    public boolean predictTheWinner(int[] nums) {
        

        return  helper(nums,0,nums.length-1,0,0,true);
    }
}