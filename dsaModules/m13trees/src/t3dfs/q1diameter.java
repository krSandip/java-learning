package t3dfs;

public class q1diameter {

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

        static int diameter = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return diameter;
        }

        static int height(TreeNode node){
            if(node == null){
                return 0;
            }

            int h1 = height(node.left);
            int h2 = height(node.right);

            int dia = h1 + h2;
            diameter = Math.max(diameter, dia);

            return (Math.max(h1, h2)) + 1;
        }

    }
}
