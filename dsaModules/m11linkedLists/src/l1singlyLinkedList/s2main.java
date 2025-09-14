package l1singlyLinkedList;

public class s2main {
    public static void main(String[] args) {

        s1customLL list = new s1customLL();
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(5);
        list.insertFirst(2);
        list.display();
        list.insertLast(99);
        list.display();
        list.insert(200, 2);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
    }
}
