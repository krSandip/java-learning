import java.util.List;
import java.util.Vector;

public class v1vectorDemo {
    public static void main(String[] args) {
        // Creating a Vector
        List<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Accessing elements from the Vector
        System.out.println("First element: " + vector.get(0));
        System.out.println("Second element: " + vector.get(1));

        // Iterating over elements in the Vector
        System.out.println("Elements in Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Removing an element from the Vector
        vector.remove("Banana");
        System.out.println("After removing Banana: " + vector);

        // Checking the capacity and size of the Vector
        System.out.println("Current size: " + vector.size());
        System.out.println("Current capacity: " + ((Vector<String>) vector).capacity());
    }
}

