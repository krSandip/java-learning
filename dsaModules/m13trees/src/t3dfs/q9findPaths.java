package t3dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class q9findPaths {

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

    public int findPaths(TreeNode root, int target){
        if(root == null){
            return 0;
        }
        return helper(root, target, new ArrayList<Integer>());
    }

    private int helper(TreeNode node, int target, List<Integer> list){
        if(node == null){
            return 0;
        }
        list.add(node.val);
        int count = 0;
        int sum = 0;
        // how many paths I can make
        ListIterator<Integer> itr = list.listIterator(list.size());
        while (itr.hasPrevious()){
            sum = sum + itr.previous();
            if(sum == target){
                count++;
            }
        }
        count = count + helper(node.left, target, list) + helper(node.right, target, list);
        // backtracking
        list.remove(list.size() -1);
        return count;
    }

    public static void main(String[] args) {

    }
}
