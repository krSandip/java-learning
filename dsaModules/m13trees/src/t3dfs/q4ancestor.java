package t3dfs;

public class q4ancestor {
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
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            return findAns(root, p, q);
        }

        static TreeNode findAns(TreeNode node, TreeNode p, TreeNode q){
            if(node.val == p.val || node.val == q.val){
                return node;
            }

            TreeNode left = findAns(node.left, p, q);
            TreeNode right = findAns(node.right, p, q);

            if(left != null && right != null){
                return node;
            }
            if(left == null) {
                return right;
            }
            else{
                return left;
            }
        }
    }
}
