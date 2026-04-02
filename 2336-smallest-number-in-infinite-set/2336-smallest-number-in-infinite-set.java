class SmallestInfiniteSet {
    boolean vis[];
    public SmallestInfiniteSet() {
        vis = new boolean[1001];
    }
    
    public int popSmallest() {
        int idx=0;
        for(int i=1;i<1001;i++){
            if(!vis[i]){
                vis[i]=true;
                idx=i;
                break;
            }
        }
        return idx;
    }
    
    public void addBack(int num) {
        
            vis[num] = false;
       
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */