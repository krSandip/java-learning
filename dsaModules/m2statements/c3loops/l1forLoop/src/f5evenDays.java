// Q : Sandeep is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
import java.util.Scanner;
public class f5evenDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number of days in month of august : " +31);
        int count = 0;
        for(int i =1; i<=31; i++){
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("number of days he can go out : " +count);
    }
}
