public class b6resetBit {
    public static void main(String[] args) {
        int n = 40;
        int i = 5;
        System.out.println(newNum(n,i));
    }
    static int newNum(int n, int i){
        // creating mask and then AND it with number given
        return n & ~(1 << (i-1));
    }
}