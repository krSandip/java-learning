import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class m1mapDemo {
    public static void main(String[] args) {
        Map m = new TreeMap();
        System.out.println("1. Map is  "+m);

        m.put(1,"alpha");
        m.put(2,"beta");
        m.put(3, "gamma");
        System.out.println("2. Map after put is  "+m);

        m.remove(2);
        System.out.println("3. Map after remove 2 is  "+m);

        m.put(2,"beta");m.put(4, "omega");
        Iterator it = m.keySet().iterator();
        while(it.hasNext()){
            System.out.println("The values inside map is "+m.get(it.next()));
        }
    }
}
