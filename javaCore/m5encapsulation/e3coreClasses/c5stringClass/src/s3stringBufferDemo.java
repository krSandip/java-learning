import java.text.DecimalFormat;

public class s3stringBufferDemo {
    public static void main(String[] args) {
//        // constructor - 1
//        StringBuffer sb1 = new StringBuffer();

//        // basic functions
//        System.out.println(sb1.capacity()); // capacity
//        sb1.append("sandeepRaina"); // add
//        System.out.println(sb1);
//        sb1.insert(7, "Kumar");     // insert at index
//        System.out.println(sb1);
//        sb1.delete(1, 12);          // delete in range
//        System.out.println(sb1);
//
//        // constructor - 2
//        StringBuffer sb2 = new StringBuffer("chakravartinSamrat");
//        System.out.println(sb2.capacity());
//        // constructor - 3
//        StringBuffer sb3 = new StringBuffer(40);
//        System.out.println(sb3.capacity());

//        // whiteSpaces
//        String str = "Sandeep Raina Chakravartin Samrat";
//        System.out.println(str.replaceAll("\\s", ""));

//        //split method
//        String str = "sanddep Raina chakravartin samrat";
//        String[] arr = str.split(" ");
//        System.out.println(Arrays.toString(arr));

//        // random string
//        int n = 20;
//        String str = s2randomString.generate(n);
//        System.out.println(str);

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(8.95));
    }
}
