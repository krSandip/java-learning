public class m1primeNum {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        int c=2;
        while(c*c<n){
            if(n%c==0) {
                return false;
            }
            c++;
        }
        return true;
    }
}