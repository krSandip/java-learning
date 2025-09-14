package t1introduction;

public class t2BStree {
    public class Node{
        private int value;
        private int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }

    Node root;
    public t2BStree(){
        root = null;
    }

    public void insert(int val){
        root = insert(val, root);
    }
    private Node insert(int val, Node node){
        if(node == null){
            node = new Node(val);
            return node;
        }
        if(val < node.value){
            node.left = insert(val, node.left);
        }
        if(val > node.value){
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums){
        for(int i=0; i<nums.length; i++){
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int s, int e){
        if(s >= e){
            return;
        }
        int m = (s + e) / 2;
        this.insert(nums[m]);
        populateSorted(nums, s, m);
        populateSorted(nums, m+1, e);
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    // display
    public void display(){
        display(root, "root node: ");
    }
    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "left child of " +node.value + " : ");
        display(node.right, "right child of " +node.value + " : ");
    }

    // traversals
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }
}
