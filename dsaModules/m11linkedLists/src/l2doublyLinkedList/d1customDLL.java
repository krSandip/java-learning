package l2doublyLinkedList;


public class d1customDLL {
    private Node head;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public Node get(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val){
        Node temp = get(after);
        if(temp == null){
            System.out.println("do not exist");
            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value+ " <- ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void reversal(){
        Node node = head;
        Node last = head;
        while(node != null){
            last = node;
            node = node.next;
        }
        while(last != null){
            System.out.print(last.value+ " <- ");
            last = last.prev;
        }
        System.out.println("START");
    }

}
