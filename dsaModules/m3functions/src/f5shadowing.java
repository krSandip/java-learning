public class f5shadowing {

    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);  // x=90
        int x;                  // class variable at line 3 is shadowed by this
        // System.out.println(x);   // x is not initialised , gives error
        x=40;
        System.out.println(x);  // x=40

        fxn();                  // x=90
    }

    static void fxn(){
        System.out.println(x);
    }
}

