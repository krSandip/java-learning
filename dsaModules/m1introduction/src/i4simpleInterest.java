// Q : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class i4simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter principal amount : ");
        int P = input.nextInt();
        System.out.print("enter time in years :  ");
        int T = input.nextInt();
        System.out.print("enter rate : ");
        int R = input.nextInt();

        int I = ( P * T * R ) / 100 ;

        System.out.println("Simple Interest = " +I);
    }
}
