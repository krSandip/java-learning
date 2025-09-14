import java.util.Scanner;
public class f10palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = in.nextInt();
        fxn(num);
    }

    static void fxn(int x){
        int backup_x = x;
        int rev_x = 0;
        while(x>0){
            int digit = x % 10;
            rev_x = rev_x * 10 + digit;
            x = x / 10;
        }
        if(rev_x == backup_x){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
