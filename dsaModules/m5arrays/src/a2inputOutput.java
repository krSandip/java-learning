import java.util.Arrays;
import java.util.Scanner;
public class a2inputOutput {
    public static void main(String[] args) {
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
    }

    static void change(int[] arr1){
        arr1[1]=99;
        arr1[3]=88;
    }
}

