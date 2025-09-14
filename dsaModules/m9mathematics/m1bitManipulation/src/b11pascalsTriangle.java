public class b11pascalsTriangle {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(getSum(n));
    }
    static int getSum(int n){
        // sum of all the elements of nth row is = 2^(n-1)
        // 2^(n-1) = 1 << (n-1)
        return 1 << (n-1);
    }
}
