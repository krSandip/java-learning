// Q : Factorial Program In Java

import java.util.Scanner;
public class f6factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int x = input.nextInt();
        int factorial = 1;
        for(int i=1; i<=x; i++){
            factorial*=i;
        }
        System.out.println("factorial of " +x+ " = " +factorial);
    }
}
