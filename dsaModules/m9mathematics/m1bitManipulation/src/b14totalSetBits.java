public class b14totalSetBits {
    public static void main(String[] args) {
        int n =4;
        System.out.println(getNum(n));
    }
    static int getNum(int n){
        int count = 0;
        while(n>0){
            if((n&1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
