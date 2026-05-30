class Solution {

    Map<Integer,Integer> map = new HashMap<>();

    public void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        helper(root.right);
    }

    public int[] findMode(TreeNode root) {

        helper(root);

        int maxFreq = 0;

        for(int freq : map.values()){
            maxFreq = Math.max(maxFreq, freq);
        }

        List<Integer> list = new ArrayList<>();

        for(int key : map.keySet()){
            if(map.get(key) == maxFreq){
                list.add(key);
            }
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}