package t3dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q6serializeDeserialize {


     // Definition for a binary tree node.
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            List<String> list = new ArrayList<>();
            helper(root, list);
            return list.toString();
        }

        static void helper(TreeNode node, List<String> list){
            if(node == null){
                list.add("null");
                return;
            }

            list.add(String.valueOf(node.val));
            helper(node.left, list);
            helper(node.right, list);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            List<String> list = new ArrayList<>(Arrays.asList(data.substring(1, data.length()-1).split(", ")));
            Collections.reverse(list);
            TreeNode node = helper2(list);
            return node;
        }

         private TreeNode helper2(List<String> list){
            String val = list.remove(list.size() - 1);
            if(val.equals("null")){
                return null;
            }
            TreeNode node = new TreeNode(Integer.parseInt(val));
            node.left = helper2(list);
            node.right = helper2(list);
            return node;
        }
    }

    // Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;

    public static void main(String[] args) {

    }
}
