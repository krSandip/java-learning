import java.util.Scanner;
public class f3reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q : reverse the given number

        System.out.print("enter the number : ");
        int N = input.nextInt();
        int rev_N = 0;
        while(N > 0){
            rev_N = rev_N * 10 + N % 10 ;
            N = N / 10;
        }
        System.out.println("reversed number is " +rev_N);
    }
}
