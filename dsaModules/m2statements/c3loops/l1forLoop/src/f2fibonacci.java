import java.util.Scanner;

public class f2fibonacci {
    public static void main(String[] args) {
        // Q : print the nth fibonacci number

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        int n1 = 0;
        int n2 = 1;
        int fibonacci_num = 0;
        for(int i=2; i<=n; i++){
            fibonacci_num = n1 + n2;
            n1 = n2;
            n2 = fibonacci_num;
        }

        System.out.println("Fibonacci number is " +fibonacci_num);
    }
}
