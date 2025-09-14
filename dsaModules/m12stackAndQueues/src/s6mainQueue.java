public class s6mainQueue {
    public static void main(String[] args) throws Exception {
        s5customQueue queue = new s5customQueue(5);
        for(int i=10; i<15; i++){
            queue.add(i);
        }
        queue.display();
        queue.remove();
        queue.add(99);  // throws exception as queue is full
        queue.display();

//        s7circularQueue queue = new s8dynamicQueue(5);
//        for(int i=10; i<13; i++) {
//            queue.add(i);
//        }
//        queue.display();
//        queue.add(45);
//        queue.add(50);
//        queue.display();
//        queue.add(99);
//        queue.add(100);
//        queue.display();

    }
}
