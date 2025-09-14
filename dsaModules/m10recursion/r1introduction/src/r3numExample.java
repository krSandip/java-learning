public class r3numExample {
    public static void main(String[] args) {
        // print first five numbers using recursion
        print(1);
    }
    static void print(int n){
        // base condition
        if(n==9){
            System.out.println(n);
            return;
        }
        // body
        System.out.println(n);
        // function calling itself
        print(n+1);
    }
}
