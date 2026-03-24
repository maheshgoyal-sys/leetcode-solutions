class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int ans[] = new int[friends.length];
        Set<Integer> set = new HashSet<>();
        for(int i : friends){
            set.add(i);
        }
        int i=0,j=0;
        while(i<order.length){
            if(set.contains(order[i])){
                ans[j++] = order[i];
            }
            i++;
        }
        return ans;
    }
}