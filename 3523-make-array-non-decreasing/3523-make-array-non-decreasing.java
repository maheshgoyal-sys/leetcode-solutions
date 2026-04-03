class Solution {
    public int maximumPossibleSize(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i : nums){
           if(st.isEmpty()) st.push(i);
           if(i>=st.peek()) st.push(i);
        }
        return st.size()-1;
    }

}