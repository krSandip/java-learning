package t3dfs;

public class q5constructBT {

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
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return construct(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
        }

        TreeNode construct(int[] preorder, int[] inorder, int sp, int ep, int si, int ei){
            if(sp > ep || si > ei){
                return null;
            }
            TreeNode node = new TreeNode(preorder[sp]);
            int index = si;
            while(index <= ei && inorder[index] != preorder[sp]){
                index++;
            }
            int leftTreeSize = index - si;
            node.left = construct(preorder, inorder, sp + 1, sp + leftTreeSize, si, index - 1);
            node.right = construct(preorder, inorder, sp + leftTreeSize + 1, ep, index+1, ei);
            return node;
        }
    }
}
