public class f1syntax {
    static int fxn_name(int a, int b){
        int add = a + b;
        return add;
    }

    static void swap(int a,int b){
        int temp = a;                    // here we are creating the new objects
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        System.out.println(fxn_name(4, 6));

        int x = 4;
        int y = 5;
        swap(x,y);
        System.out.println(x+ " " +y);   // values will not change because of the pass by value, not pass by reference

    }
}
