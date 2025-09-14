package t1introduction;

public class t4segmentTree {
    private static class Node{
        int data;
        int sIndex;
        int eIndex;
        Node left;
        Node right;

        public Node(int sIndex, int eIndex){
            this.sIndex = sIndex;
            this.eIndex = eIndex;
        }
    }

    Node root;
//    public t4segmentTree(int[] arr){
//        this.root = null;
//    }

    public t4segmentTree(int[] arr){
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int s, int e){
        if(s == e){
            Node node = new Node(s, e);
            node.data = arr[s];
            return node;
        }
        Node node = new Node(s, e);
        int m = (s + e) / 2;
        node.left = this.constructTree(arr, s, m);
        node.right = this.constructTree(arr, m+1, e);
        node.data = node.left.data + node.right.data;
        return node;
    }

    // display function
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        if(node == null){
            return;
        }

        String str = "";
        if(node.left == null && node.right == null){
            return;
        }
        if(node.left != null){
            str = str + "Intervals = [" + node.left.sIndex+ "-" +node.left.eIndex+ " ] and Data : " +node.left.data+ " => ";
        }else{
            str = str + "no left child";
        }

        str = str + "Intervals = [" + node.sIndex+ "-" +node.eIndex+ " ] and Data : " +node.data+ " => ";

        if(node.right != null){
            str = str + "Intervals = [" + node.right.sIndex+ "-" +node.right.eIndex+ " ] and Data : " +node.right.data+ " => ";
        }else{
            str = str + "no right child";
        }

        System.out.println(str);

        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }

    // query
    public int query(int qsi, int qei){
        return this.query(this.root, qsi, qei);
    }
    private int query(Node node, int qsi, int qei){
        if(node == null){
            return 0;
        }
        if(node.sIndex >= qsi && node.eIndex <= qei){
            return node.data;
        } else if(node.sIndex > qei || node.eIndex < qsi){
            return 0;
        }else{
            int leftAns = (node.left != null)? this.query(node.left, qsi, qei) : 0;
            int rightAns = (node.right != null)? this.query(node.right, qsi, qei) : 0;
            return  leftAns + rightAns;
        }
    }

    // update function
    public void update(int index, int value){
        update(this.root, index, value);
    }
    private int update(Node node, int index, int value){
        if(node == null){
            return 0;
        }
        if(index >= node.sIndex && index <= node.eIndex){
            if(index == node.sIndex && index == node.eIndex){
                node.data = value;
                return node.data;
            }
            else{
                int leftAns = (node.left != null)? update(node.left, index, value) : 0;
                int rightAns = (node.right != null)? update(node.right, index, value) : 0;
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 7, 6, -2, -8, 4, 9};
        t4segmentTree tree = new t4segmentTree(arr);
        tree.display();
        System.out.println(tree.query(2, 6));
        tree.update(3, 14);
        tree.display();
    }
}
