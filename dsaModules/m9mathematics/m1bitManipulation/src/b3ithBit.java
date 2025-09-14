public class b3ithBit {
    public static void main(String[] args) {
        int n = 40;
        int i = 6;
        System.out.println(bit(n,i));
    }
    static int bit(int n, int i){
        // creating mask and then AND it with number given
        int x = n & (1 << (i-1));
        if(x==0){
            return 0;
        }
        return 1;
    }
}