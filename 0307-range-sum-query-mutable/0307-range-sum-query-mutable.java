class NumArray {
    int bit[];
    int nums[];
    int n;
    public NumArray(int[] nums) {
        this.nums=nums;
        this.n = nums.length;
        bit=new int[n+1];
        for(int i=0;i<n;i++){
            add(i,nums[i]); 
        }
    }
    private void add(int i, int val) {
        i++;
        while (i <= n) {
            bit[i] += val;
            i += (i & -i);
        }
    }
    
    public void update(int i, int val) {
        int diff = val - nums[i];
        nums[i] = val;
        i++;
        for(;i<=n;i+=(i&-i)){
            bit[i]+=diff;
        }
    }
    
    public int sumRange(int left, int right) {
        return sum(right) - sum(left-1);
    }
    public int sum(int i){
        int ans = 0;
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
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */