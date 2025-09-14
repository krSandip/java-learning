public class b17alternatingBits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(hasAlternatingBits(n));
    }
    public static boolean hasAlternatingBits(int n) {
        int bit = n % 2;
        n = n/2;
        while(n>0){
            int newBit = n % 2;
            if(newBit == bit){
                return false;
            }
            bit = newBit;
            n = n/2;
        }
        return true;

    }
}
