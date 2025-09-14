package t3dfs;

public class q3validateBST {
    public static void main(String[] args) {

    }

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

    class Solution {
        public boolean isValidBST(TreeNode root) {
            return helper(root, null, null);
        }

        static boolean helper(TreeNode node, TreeNode min, TreeNode max){
            if(node == null){
                return true;
            }
            if(min != null && node.val <= min.val){
                return false;
            }

            if(max != null && node.val >= max.val){
                return false;
            }

            return helper(node.left, min, node) && helper(node.right, node, max);
        }
    }
}
