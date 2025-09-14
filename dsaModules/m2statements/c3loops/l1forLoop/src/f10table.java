// Q : Take a number as input and print the multiplication table for it.
import java.util.Scanner;
public class f10table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print(" " +num*i);
        }
    }
}

