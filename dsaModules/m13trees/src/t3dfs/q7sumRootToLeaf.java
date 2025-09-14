package t3dfs;

public class q7sumRootToLeaf {

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
        public int sumNumbers(TreeNode root) {
            return preOrder(root, 0);
        }

        static int preOrder(TreeNode node, int number){
            if(node == null){
                return 0;
            }

            number = number * 10 + node.val;

            if(node.left == null && node.right == null){
                return number;
            }

            return preOrder(node.left, number) + preOrder(node.right, number);
        }
    }
}
