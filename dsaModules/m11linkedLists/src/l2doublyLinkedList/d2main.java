package l2doublyLinkedList;

public class d2main {
    public static void main(String[] args) {
        d1customDLL list = new d1customDLL();
        list.insertFirst(13);
        list.insertFirst(9);
        list.insertFirst(5);
        list.insertFirst(2);
        list.display();
        list.reversal();
        list.insertLast(99);
        list.display();
        list.insert(2, 100);
        list.display();
    }
}
