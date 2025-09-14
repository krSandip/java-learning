// Q : To find Armstrong Number between two given number.
import java.util.Scanner;
public class w7armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        for(int i=n1; i<=n2; i++){

            int num= i;
            int ori_i = num;
            int count=0;
            int sum = 0;
            while(i>0){
                int digit = i % 10;
                count = count + 1;
                i = i/ 10;
            }
            while(num>0){
                int digit = num % 10;
                sum = sum + digit^count;
                num = num / 10;
            }

            if(sum == ori_i){
                System.out.println("Armstrong number is : " +ori_i);
                break;
            }
        }
        System.out.println("No Armstrong number");
    }
}

