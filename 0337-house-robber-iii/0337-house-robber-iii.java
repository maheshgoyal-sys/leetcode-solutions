class Solution {
    HashMap<TreeNode,Integer> map=new HashMap<>();
    public int rob(TreeNode root) {
        if (root == null) return 0;
        if(map.containsKey(root)){
            return map.get(root);
        }

        // Case 1: rob current node
        int rob = root.val;

        if (root.left != null) {
            rob += rob(root.left.left);
            rob += rob(root.left.right);
        }
        if (root.right != null) {
            rob += rob(root.right.left);
            rob += rob(root.right.right);
        }

        // Case 2: skip current node
        int skip = rob(root.left) + rob(root.right);
        int ans=Math.max(rob, skip);
        map.put(root,ans);
    

        return ans;
    }
}