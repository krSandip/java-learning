public class f7overloading {
    public static void main(String[] args) {

        fxn(4,6);
    }

    static void fxn(int x,int y ){     // either the number of parameters should be different or the type of parameter
        int multiply = x*y;
        System.out.println(multiply);
    }
    static void fxn(int a, int b,int c){
        int sum = a+b;
        System.out.println(sum);
    }
}
