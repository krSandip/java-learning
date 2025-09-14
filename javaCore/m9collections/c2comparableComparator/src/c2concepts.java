import java.util.Arrays;

public class c2concepts implements Comparable<c2concepts>{
    String name;
    int rNo;
    float marks;

    public c2concepts(String name, int rNo, float marks){
        this.name = name;
        this.rNo = rNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(c2concepts o){
        int diff = (int)(this.marks - o.marks);
        return diff;
    }

    public String toString(){
        return rNo+" ";
    }

    public static void main(String[] args) {
        /*
        In Java, Comparators are used to define custom orderings for objects when sorting or comparing them.
        They are part of the java.util package and are particularly useful when you want to sort objects
        that don't have a natural ordering or when you want to sort objects based on different criteria.

        Overview of Comparators:
        Comparator Interface: The Comparator interface is used to compare two objects of the same type.
        Method to Implement: The key method in this interface is compare(T o1, T o2), which compares two objects and returns:
        1 - A negative integer if the first object is less than the second.
        2 - Zero if the first object is equal to the second.
        3 - A positive integer if the first object is greater than the second.

        Implementing a Comparator:
        You can implement the Comparator interface in two main ways:
        1 - By creating a separate class.
        2 - By using anonymous inner classes or lambda expressions (from Java 8 onward).

        Key Points:
        1 - Comparator is typically used when you need multiple ways to compare objects or when the class does not implement Comparable.
        2 - You can use lambda expressions to simplify the creation of comparators.
        3 - Comparator allows you to sort objects in ways other than their natural ordering (which is defined by the Comparable interface).
         */

        c2concepts student1 = new c2concepts("sandeep", 30, 75.82f);
        c2concepts student2 = new c2concepts("rahul", 20, 95.52f);
        c2concepts student3 = new c2concepts("sumit", 23, 87.26f);
        c2concepts student4 = new c2concepts("anup", 12, 78.66f);
        c2concepts student5 = new c2concepts("sachin", 10, 80.42f);

//        if(student1.compareTo(student2) < 0){
//            System.out.println("rahul has more marks");
//        }
//        else if(student1.compareTo(student2) > 0){
//            System.out.println("sandeep has more marks");
//        }
//        else{
//            System.out.println("both have same marks");
//        }
        c2concepts[] list = {student1, student2, student3, student4, student5};
        System.out.println(Arrays.toString(list));

//        //1- using anonymous inner class ( Comparator )
//        Arrays.sort(list, new Comparator<c1Student>() {
//            @Override
//            public int compare(c1Student o1, c1Student o2) {
//                return (int)(o1.rNo - o2.rNo);
//            }
//        });
//
        //2 - using lambda expression as follows ( Comparator )
        Arrays.sort(list, (o1, o2) -> (int)(o1.rNo- o2.rNo));
        System.out.println(Arrays.toString(list));

    }

}