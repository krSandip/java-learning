import java.util.Scanner;
public class w8palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        int ori_num = num;
        int rev_num = 0 ;
        int numLength = 0;
        while(num>0){
            int digit = num % 10;
            rev_num = rev_num*10+digit;
            num /= 10;
        }
        if(rev_num == ori_num){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}