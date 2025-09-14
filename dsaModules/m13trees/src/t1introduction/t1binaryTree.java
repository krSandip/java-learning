package t1introduction;

import java.util.Scanner;

public class t1binaryTree {

    private class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    Node root;
    public t1binaryTree(){
        root = null;
    }

    public void populate(Scanner sc){
        System.out.println("enter the root node");
        int rootValue = sc.nextInt();
        root = new Node(rootValue);
        populate(sc, root);
    }
    public void populate(Scanner sc, Node node){
        System.out.println("do you want to create left of " +node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter the value left of " +node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("do you want to create right of " +node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the value right of" +node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(this.root, "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
}
