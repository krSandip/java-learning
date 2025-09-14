package h2questions;

import java.util.ArrayList;

public class q6convertBSTtoMinHeap {


    //User function Template for Java

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

    class Solution{
        public static void convertToMaxHeapUtil(Node root){
            //code here
            ArrayList<Integer> list = new ArrayList<>();
            inOrder(root, list);
            int[] index = {list.size()-1};
            preOrder(root, list, index);
        }

        static void inOrder(Node node, ArrayList<Integer> list){
            if(node == null){
                return;
            }
            inOrder(node.left, list);
            list.add(node.data);
            inOrder(node.right, list);
        }


        static void preOrder(Node node, ArrayList<Integer> list, int[] index){
            if(node == null){
                return;
            }
            node.data = list.get(index[0]);
            index[0]--;
            preOrder(node.right, list, index);
            preOrder(node.left, list, index);
        }
    }

    public static void main(String[] args) {

    }
}
