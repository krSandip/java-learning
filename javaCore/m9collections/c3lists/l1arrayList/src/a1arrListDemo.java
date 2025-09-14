import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class a1arrListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // syntax :
        ArrayList<Integer> list = new ArrayList<>(5);

        // input :
        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
/*
        // some operations
        list.add(3);             // is used to add an element
        list.set(0,99);          // is used to push new element
        list.remove(3);          // is used to remove an element
        list.get(2);             // is used to get an element
        list.clear();            // is to delete all elements
*/
        // output_1 :
        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+ " ");
        }
        // output_2 :
        System.out.println(list);

        //
        List al = new ArrayList();
        System.out.println("1.al is "+al);
        al.add(0,"obj0");
        System.out.println("2.al is "+al);
        al.add("obj1");
        System.out.println("3.al is "+al);
        al.add(0,"obj2");
        System.out.println("4.al is "+al);
        al.set(0, "obj3");
        System.out.println("5.al is "+al);
        al.remove("obj3");
        System.out.println("6.al is "+al);

        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println("Inside the while loop and the elemnet is "+it.next());
        }

    }
}
