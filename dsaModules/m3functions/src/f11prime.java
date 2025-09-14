import java.util.Scanner;
public class f11prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        for(int i=num1; i<=num2; i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }

    static boolean isPrime(int x){
        if(x<=1){
            return false;
        }
        for(int j=2; j<x; j++){
            if(x%j==0){
                return false;
            }
        }
        return true;
    }
}
