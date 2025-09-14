package l4questions;

public class allQuestions {
    private Node head;
    private Node tail;
    private int size;

    public allQuestions(){
        this.size = 0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        if(tail == null){
            tail = head;
        }
        head = node;
        size +=1;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value+ " <- ");
            node = node.next;
        }
        System.out.println("END");
    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    // inserting using recursion
    public void insert(int index, int val){
        head = insertRec(index, val, head);
    }
    private Node insertRec(int index, int val, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size += 1;
            return temp;
        }
        node.next = insertRec(index-1, val, node.next);
        return node;
    }

    // bubble sort
    public void bubbleSort(){
        sort(size-1, 0);
    }
    private void sort(int row, int col){
        if(row == 0){
            return;
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.value > second.value){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            sort(row, col+1);
        }
        else{
            sort(row-1, 0);
        }
    }

    // reversing a linkedList using recursion
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        allQuestions list = new allQuestions();
        // inserting elements using insertFirst method
        for(int i=4; i<10; i++){
            list.insertFirst(i);
        }
        list.display();
        // insert using recursion
        list.insert(4, 99);
        list.display();
        list.bubbleSort();
        list.display();
        list.reverse(list.head);
        list.display();
    }
}
