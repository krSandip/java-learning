import java.util.Arrays;

public class f6varargs {
    public static void main(String[] args) {
        fxn(3, 5, 7, 0, 2);
        fxn("p", "a", "r");
    }

    static void fxn(int... i) {
        System.out.println(Arrays.toString(i));
    }

    static void fxn(String... w) {
        System.out.println(Arrays.toString(w));
    }
}
