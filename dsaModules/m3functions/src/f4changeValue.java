import java.util.Arrays;

public class f4changeValue {
    public static void main(String[] args) {
        int [] arr1 = {1, 3, 5, 2, 7};
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void change(int[] arr2){
        arr2[0] = 77;                      // here we are changing the object or value
    }
}

