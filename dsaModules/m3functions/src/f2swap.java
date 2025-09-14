public class f2swap {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        swap(x,y);
        System.out.println(x+ " " +y);   // values will not change because of the pass by value, not pass by reference

    }

    static void swap(int a,int b){
        int temp = a;                    // here we are creating the new objects
        a = b;
        b = temp;
    }
}

