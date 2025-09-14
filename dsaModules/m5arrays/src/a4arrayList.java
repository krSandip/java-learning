import java.util.ArrayList;
import java.util.Scanner;
public class a4arrayList {
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
    }
}

