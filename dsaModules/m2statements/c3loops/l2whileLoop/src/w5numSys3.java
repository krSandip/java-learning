// Q : Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class w5numSys3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter number : ");
        int largest = 0;
        while(true){
            int x = input.nextInt();
            if(x>largest){
                largest = x;
            }
            if(x==0){
                break;
            }
        }
        System.out.println("largest number = " +largest);
    }
}