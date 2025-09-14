public class r4fibonacciNum {
    public static void main(String[] args) {
        // print the nth fibonacci number
        int ans = fibo(7);
        System.out.println(ans);
    }
    static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        // body and function itself calling
        // recursion tree
        return fibo(n-1) + fibo(n-2);
    }
}