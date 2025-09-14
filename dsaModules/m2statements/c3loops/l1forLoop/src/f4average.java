// Q : Calculate Average Of N Numbers
import java.util.Scanner;
public class f4average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the total number of numbers : ");
        float N = input.nextInt();
        float sum = 0;
        System.out.println("enter the numbers : ");
        for(int i=1; i<=N; i++){
            int  num = input.nextInt();
            sum = sum + num;
        }
        float Average = sum / N;
        System.out.println("Average : " +Average);
    }
}