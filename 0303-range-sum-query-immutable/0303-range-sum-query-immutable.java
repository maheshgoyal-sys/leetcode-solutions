class NumArray {
    int nums[];
    int bit[];
    int n;
    public NumArray(int[] nums) {
        n=nums.length;
        bit=new int[n+1];
        for(int i=0;i<n;i++){
            add(i,nums[i]);
        }
    }
    public void add(int i,int val){
        i++;
        for( ;i<=n;i+=(i&-i)){
            bit[i]+=val;
        }
    }
    public int sumRange(int left, int right) {
        return sum(right) - sum(left-1);
    }
    public int sum(int i){
        int ans=0;
        i++;
        for( ;i>0;i-=(i&-i)){
            ans+=bit[i];
        }
    return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */