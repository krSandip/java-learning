package h2questions;

public class q3isBTheap {


//Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


    class Solution {
        boolean isHeap(Node root) {
            // code here
            int nodeCount = nodeCount(root);

            if(isCBT(root, 0, nodeCount) && isMaxHeap(root)){
                return true;
            }
            else{
                return false;
            }
        }

        int nodeCount(Node node){
            if(node == null){
                return 0;
            }

            return 1 + nodeCount(node.left) + nodeCount(node.right);
        }

        boolean isCBT(Node node, int index, int nodeCount){
            if(node == null){
                return true;
            }

            if(index >= nodeCount){
                return false;
            }

            return isCBT(node.left, 2*index+1, nodeCount) && isCBT(node.right, 2*index+2, nodeCount);
        }

        boolean isMaxHeap(Node node){
            if(node.left == null && node.right == null){
                return true;
            }

            if(node.right == null){
                return node.data >= node.left.data && isMaxHeap(node.left);
            }

            return (node.data >= node.left.data && node.data >= node.right.data) &&
                    isMaxHeap(node.left) && isMaxHeap(node.right);
        }
    }
}
