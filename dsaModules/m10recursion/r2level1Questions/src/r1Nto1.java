public class r1Nto1 {
    public static void main(String[] args) {
        int n = 5;
        ReverseRecursion(n);
        Recursion(n);
    }
    static void ReverseRecursion(int n){
        if(n==1){
            System.out.println(n);
        }else{
            System.out.println(n);
            ReverseRecursion(n-1);
        }
    }
    static void Recursion(int n){
        if(n==1){
            System.out.println(n);
        }
        else{
            Recursion(n-1);
            System.out.println(n);
        }

    }
}
