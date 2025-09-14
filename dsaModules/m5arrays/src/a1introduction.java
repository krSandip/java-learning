public class a1introduction {
    public static void main(String[] args) {

        /*  Arrays are the collection of same datatype

        Syntax :
        datatype[] variable name = new datatype[size];

        int[] roll_numbers;  //Declaration- roll_numbers is getting defined in the stack - compile time
        roll_numbers = new int[5];  // Initialisation- actually here object is being created in the heap - runtime(dynamic memory allocation)

        Continuity in array
        1- array objects are in heap
        2- heap objects are not contiguous - hence array objects may not be contiguous-depends on JVM
        3- dynamic memory allocation

        Index of array :
        What is null : special by-default value - what the ref.variable point to
       */
        int[] arr1 = new int[4];
        System.out.println(arr1[2]);  // output- 0
        String[] arr2 = new String[7];
        System.out.println(arr2[6]);  // output- null
    }
}
