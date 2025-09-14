import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class g2genericMap {
    public static void main(String[] args) {
        mapDemo();
    }

    static void mapDemo(){
        Map<Integer,String> m= new HashMap<>();
        m.put(1, "alpha");m.put(2, "beta");m.put(3, "gamma");
        System.out.println("map is "+m);
        System.out.println("the value for key 2 is "+m.get(2).concat(" hello world"));

        Iterator<Integer> keyIt= m.keySet().iterator();
        while(keyIt.hasNext()){
            System.out.println("map has "+m.get(keyIt.next()).toUpperCase());
        }
    }
}
