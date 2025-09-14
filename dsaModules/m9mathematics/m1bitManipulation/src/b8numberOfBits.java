public class b8numberOfBits {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(bitsNumber(n));
    }
    static int bitsNumber(int n){
        int x = (int)((Math.log(n))/(Math.log(2.0)) + 1);
        return x;
    }
}
