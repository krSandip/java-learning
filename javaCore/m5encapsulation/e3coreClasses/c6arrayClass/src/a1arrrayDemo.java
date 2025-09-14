import java.util.Arrays;
import java.util.Scanner;

public class a1arrrayDemo {
    public static void main(String args[]){

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

        Scanner in = new Scanner(System.in);

/*        //   taking input_1
          int[] arr = new int[4];
          arr[0]=20;
          arr[1]=10;
          arr[2]=70;
          arr[3]=60;
          System.out.println(arr[2]); // output- 70

          //   taking input_2
        for(int i=0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
*/
/*
           //  Taking output_1
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");

           }
            //   Taking output_2
        System.out.println(Arrays.toString(arr));
*/
/*
            // array of objects
        String[] str = new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
*/
        // passing in functions
        int[] arr = {2,4,6,9};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


        int[] intArray= new int[]{1,2,2};

        intArray = Arrays.copyOf(intArray, 5);
        for(int j: intArray){
            System.out.println("Value after copy of "+j);
        }
        intArray = Arrays.copyOfRange(intArray,2,5);
        for(int j: intArray){
            System.out.println("Value after copy of "+j);
        }
    }

    static void change(int[] arr1){
        arr1[1]=99;
        arr1[3]=88;
    }
}
