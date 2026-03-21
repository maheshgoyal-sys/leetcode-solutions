class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int rank = 1;
        int sorted[] = nums.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : sorted){
            if(!map.containsKey(i)){
                map.put(i,rank++);
            }
        }
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int bit[] = new int[n+1];
        for(int i=n-1;i>=0;i--){
            int r = map.get(nums[i]);
            res.add(sum(bit,r-1));
            update(bit,r,1);
        }
        Collections.reverse(res);
        return res;
    }
        public static void update(int bit[],int i,int val){
    
            i++;
            for( ;i<=bit.length-1;i+=i&-i){
                bit[i]+=val;
            }
        }
        public static int sum(int bit[],int i){
            i++;
            int ans = 0;
            for( ;i>0;i-=i&-i){
                ans+=bit[i];
            }
            return ans;
        
    }
}