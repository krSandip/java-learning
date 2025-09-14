package t2bfs;

public class q3cousinsProblem {
    public static void main(String[] args) {

    }


     // Definition for a binary tree node.
     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
         TreeNode(int val) {
            this.val = val;
         }
         TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            TreeNode xx = findNode(root, x);
            TreeNode yy = findNode(root, y);

            return ((level(xx, x, 0) == level(yy, y, 0)) && !cousin(root, xx, yy) );
        }

        static TreeNode findNode(TreeNode node, int key){
            if(node == null){
                return null;
            }
            if(node.val == key){
                return node;
            }
            TreeNode n = findNode(node.left, key);
            if(n.left != null){
                return n;
            }
            return findNode(node.right, key);
        }

        static int level(TreeNode node, int n, int lev){
            if(node == null){
                return 0;
            }
            if(node.val == n){
                return lev;
            }
            int l = level(node.left, n, lev + 1);
            if(l != 0){
                return l;
            }
            return level(node.right, n, lev + 1);
        }

        static boolean cousin(TreeNode node, TreeNode xx, TreeNode yy){
            if(node == null){
                return false;
            }
            return ((node.left == xx && node.right == yy) || (node.left == yy && node.right == xx) || cousin(node.left, xx, yy) || cousin(node.right, xx, yy));
        }
    }
}
