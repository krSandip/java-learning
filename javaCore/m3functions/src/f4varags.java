import java.util.Arrays;

public class f4varags {
    public static void main(String[] args) {

        String fName="Hello";String lName="World";
        System.out.println("checksum value of 2 ints is "+checksum(1,2));
        System.out.println("checksum value of 4 ints is "+checksum(1,2,3,4));

        // format and printf methods
        System.out.println(" The value of first name is "+fName+" and last name is "+lName);
        System.out.format(" The value of first name is %s and value of last name is %s and display name is %s\n", fName,lName,(fName+"_"+lName));

        fxn(3, 5, 7, 0, 2);
        fxn("p", "a", "r");
    }

    public static int checksum(int ... vals){
        int sum=0;
        for (int i : vals){
            sum+=i;
        }
        return sum;
    }

    static void fxn(int... i) {
        System.out.println(Arrays.toString(i));
    }

    static void fxn(String... w) {
        System.out.println(Arrays.toString(w));
    }
}
