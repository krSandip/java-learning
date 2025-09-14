package t3dfs;

public class maxPathSum {
    class Solution {
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

        private int maxSum;
        public int maxPathSum(TreeNode root) {
            maxSum = Integer.MIN_VALUE;
            int currentSum = postOrder(root);
            return maxSum;
        }

        private int postOrder(TreeNode node){
            if(node == null){
                return 0;
            }

            int left = Math.max(postOrder(node.left), 0);
            int right = Math.max(postOrder(node.right), 0);

            int currentSum = left + right + node.val;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }

            return Math.max(left, right) + node.val;
        }
    }
}
