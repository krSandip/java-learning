import java.util.*;

public class i1collectionDemo {
    public static void main(String[] args) {
        /*
        1 - Interfaces: These are abstract data types that represent collections. The core collection interfaces are:
        * Collection: The root interface in the collection hierarchy.
                      It is a part of the java.util package and
                       is used to represent a group of objects, known as elements.
        * List: An ordered collection (also known as a sequence).
                Lists can contain duplicate elements.
                Some common implementations are ArrayList, LinkedList, and Vector.
        * Set: A collection that cannot contain duplicate elements.
               Some common implementations are HashSet, LinkedHashSet, and TreeSet.
        * Queue: A collection used to hold multiple elements prior to processing.
                 Typically, it orders elements in a FIFO (First-In-First-Out) manner.
                 Common implementations are PriorityQueue and LinkedList.
        * Map: An object that maps keys to values, with no duplicate keys allowed.
               Some common implementations are HashMap, LinkedHashMap, and TreeMap.

        2 - Classes: These are concrete implementations of the collection interfaces.
                     They provide specific data structures and their associated operations.
                     Some commonly used classes include:
         * ArrayList: A resizable array implementation of the List interface.
         * LinkedList: A doubly-linked list implementation of the List and Queue interfaces.
         * HashSet: A hash table implementation of the Set interface.
         * TreeSet: A sorted set implemented using a red-black tree.
         * HashMap: A hash table implementation of the Map interface.
         * TreeMap: A sorted map implemented using a red-black tree.

         3 - Algorithms: The framework provides algorithms that perform useful computations,
                     such as searching and sorting, on collections. These algorithms are polymorphic,
                     meaning that they operate on objects that implement the collection interfaces.
                     Examples include sort, shuffle, reverse, etc.

         4 - Utility Classes:
         * Collections: A utility class that contains static methods for
                        manipulating collections, such as sorting and searching.
         * Arrays: A utility class that provides methods for manipulating arrays
                   (e.g., sorting and searching).
         */

        /*
        Following example demonstrates how to use ArrayList, HashSet,
        and HashMap, showing the basic operations that can be
        performed on collections within the framework.
         */

        // Creating a List using ArrayList
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Creating a Set using HashSet
        Set<String> set = new HashSet<>(list);

        // Creating a Map using HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        // Iterating over the list
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Iterating over the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
