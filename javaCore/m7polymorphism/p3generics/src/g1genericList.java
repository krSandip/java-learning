import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g1genericList {
    public static void main(String[] args) {
        listDemo();
    }

    static void listDemo() {
        List<Integer> intList = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        List intList2 = new ArrayList();
        intList.add(new Integer(1));
        intList.add(2);
        intList.add(3);
        intList2.add(1);
        intList2.add(2);
        intList2.add(3);
        strList.add("alpha");
        strList.add("beta");
        strList.add("gamma");
        //System.out.println("intList is "+intList);
        Integer i = 0;
        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            i = it.next();
            //System.out.println(" the value is "+i);
        }
    }
}
