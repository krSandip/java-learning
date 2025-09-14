package l3circularLinkedList;

public class c1customCLL {
    private Node head;
    private Node tail;

    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);

    }
    public void display(){
        Node node = head;
        if(head != null) {
            do{
                System.out.print(node.value+ " -> ");
                node = node.next;
            }while(node != head);
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
