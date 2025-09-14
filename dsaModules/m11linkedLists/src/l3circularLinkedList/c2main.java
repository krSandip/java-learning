package l3circularLinkedList;

public class c2main {
    public static void main(String[] args) {
        c1customCLL list = new c1customCLL();
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(6);
        list.insertLast(8);
        list.insertLast(11);
        list.display();
        list.delete(6);
        list.display();
    }
}
