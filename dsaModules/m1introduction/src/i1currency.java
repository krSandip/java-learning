// Q : Input currency in rupees and output in USD.
import java.util.Scanner;
public class i1currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the amount in rupees : ");
        float Rupees = input.nextInt();
        float USD =  Rupees / 83;
        System.out.println("USD : " +USD);
    }
}
