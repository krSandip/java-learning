// Q : subtract the product and sum of digits of a given number
import java.util.Scanner;
public class w4numSys2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number : ");
        int x = input.nextInt();
        int product = 1;
        int sum = 0;
        while(x!=0){
            int digit = x % 10;
            product = product * digit;
            sum = sum + digit;
            x = x / 10;
        }

        System.out.println("product of the digits : "+product);
        System.out.println("sum of the digits : "+sum);

        int diff = product - sum ;
        System.out.println("difference is " +diff);
    }
}

