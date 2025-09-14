public class r4concept {
    public static void main(String[] args) {
        int n = 5;
        fxn(n);
    }
    static void fxn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // fxn(n--);   it calls infinitely
        fxn(--n);     // n = n -1
    }
}
