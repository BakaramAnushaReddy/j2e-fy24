class T10 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        
        if(val<root.val)
            return searchBST(root.left, val);
        if(val>root.val)
            return searchBST(root.right, val);
        if(val == root.val)
            return root;

        return null;
    }
}
