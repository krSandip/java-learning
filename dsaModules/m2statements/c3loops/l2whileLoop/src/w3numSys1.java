// Q : Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;
public class w3numSys1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        int sum = 0;
        System.out.println("enter the numbers");
        while(!choice.equals("x")){
            choice = input.next();

            if(!choice.equals("x")){
                int number = Integer.parseInt(choice);
                sum = sum + number;
            }
        }
        System.out.println("Sum : " +sum);
    }
}
