import java.util.ArrayList;
import java.util.List;

public class g4wildcards {
    public static void main(String[] args) {
        List<? super A> l = new ArrayList<>();
        l.add(new A());l.add(new B());l.add(new C());
        g1genericList.listDemo();
    }

    static void wildcardDemo(List<?> l){
        for(Object o : l){
            System.out.println("The item is "+o);
        }
    }

    static double wildcardDemo2(List<? extends Number> l){
        double sum =0;
        for(Number o : l){
            sum = sum + o.doubleValue();
        }
        return sum;
    }

    static void listDemo(){
        List <Integer> intList = new ArrayList<>();
        List <String> strList = new ArrayList<>();
        List  intList2 = new ArrayList();
        intList.add(new Integer(1));intList.add(2);intList.add(3);
        intList2.add(1);intList2.add(2);intList2.add(3);
        strList.add("alpha");strList.add("beta");strList.add("gamma");

        wildcardDemo(intList);
        wildcardDemo(strList);
        System.out.println("sum of intList is "+wildcardDemo2(intList));
        List <Double> dList = new ArrayList<>();
        dList.add(1.2);dList.add(1.3);dList.add(1.4);
        System.out.println("sum of dList is "+wildcardDemo2(dList));
    }
}

class A{};
class B extends A{};
class C extends B{};