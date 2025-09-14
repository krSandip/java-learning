public class b1oddEven {
    public static void main(String[] args) {
        int n = 10;
        int x = n & 1;
        if(x==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}