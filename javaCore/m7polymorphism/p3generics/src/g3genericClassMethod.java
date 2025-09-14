import java.util.Collection;
import java.util.LinkedList;

public class g3genericClassMethod {
    public static void main(String[] args) {
        classDemo();
    }

    static <T> boolean isPresent(T el, Collection<T> c){
        for (T i:c){
            if(el.equals(i)) return true;
            else continue;
        }
        return false;
    }

    static void classDemo(){
        myQueue<String> strQ= new myQueue<>();
        strQ.enqueue("alpha");strQ.enqueue("beta");strQ.enqueue("gamma");
        System.out.println(" strQ is "+strQ.l);
        String str =strQ.dequeue();
        System.out.println(str+":: was dequeued and the strQ is "+strQ.l);

        myQueue<Integer> intQ= new myQueue<>();
        intQ.enqueue(1);intQ.enqueue(2);intQ.enqueue(3);

        System.out.println(" intQ is "+intQ.l);
        Integer int1 =intQ.dequeue();
        System.out.println(int1+":: was dequeued and the intQ is "+intQ.l);

        System.out.println(" is alpha presnt "+isPresent("alpha", strQ.l));
        System.out.println(" is beta presnt "+isPresent("beta", strQ.l));

        System.out.println(" is 1  presnt "+isPresent(1, intQ.l));
        System.out.println(" is 3 presnt "+isPresent(3, intQ.l));

    }
}

class myQueue<T>{
    LinkedList<T> l = new LinkedList<>();
    public void enqueue(T obj){
        l.addLast(obj);
    }
    public T dequeue(){
        return l.removeFirst();
    }
}