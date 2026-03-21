class NumArray {
    static int bit[];
    static int nums[];
    static int n;
    public NumArray(int[] nums) {
        this.n=nums.length;
        this.nums=nums;
        bit=new int[n+1];
        for(int i=0;i<n;i++){
            add(i,nums[i]);
        }
    }
    public static void add(int i,int val){
        i++;
        for( ;i<=n;i+=i&-i){
            bit[i]+=val;
        }
    }
    
    public void update(int index, int val) {
        int diff = val - nums[index];
        nums[index] = val;
        index++;
        for( ;index<=n;index+=index&-index){
            bit[index]+=diff;
        }
    }
    
    public int sumRange(int left, int right) {
        return sum(right) - sum(left-1);
    }
    public static int sum(int i){
        i++;
        int ans =0;
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