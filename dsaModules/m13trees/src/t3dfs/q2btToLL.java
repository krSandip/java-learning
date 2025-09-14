package t3dfs;

public class q2btToLL {
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

        //static Queue<TreeNode> queue = new LinkedList<>();

        public void flatten(TreeNode root) {
            // O(n) space complexity

            // if(root == null){
            //     return;
            // }
            // traverse(root);
            // root = queue.poll();
            // while(!queue.isEmpty()){
            //     root.right = queue.poll();
            //     root.left = null;
            //     root = root.right;
            // }

            // O(1) space complexity solution
            TreeNode current = root;
            while(current != null){
                if(current.left != null){
                    TreeNode temp = current.left;
                    while(temp.right != null){
                        temp = temp.right;
                    }
                    temp.right = current.right;
                    // temp.left = null;
                    current.right = current.left;
                    current.left = null;
                }
                current = current.right;

            }
        }

        // static void traverse(TreeNode node){
        //     if(node == null){
        //         return;
        //     }

        //     queue.offer(node);
        //     traverse(node.left);
        //     traverse(node.right);
        // }

    }
}
