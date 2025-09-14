public class b16xorRange {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 9;
        System.out.println(xor(n2)^xor(n1-1));
    }
    static int xor(int n){
        if(n%4==0){
            return n;
        }
        else if(n%4==1){
            return 1;
        }
        else if(n%4==2){
            return n+1;
        }
        else{
            return 0;
        }
    }
}

