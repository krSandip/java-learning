public class r3sumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumDigits(n));
        System.out.println(ProductDigits(n));
        System.out.println("complexity = O(log(n))");
    }
    static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumDigits(n/10);
    }
    static int ProductDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * ProductDigits(n/10);
    }
}
