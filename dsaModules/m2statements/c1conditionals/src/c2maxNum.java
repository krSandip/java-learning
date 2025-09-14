import java.util.Scanner;
public class c2maxNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q : find the largest number
 /*
     int max = a;
        if(b > max){
            max = b;
        }
        else if(c > max){
            max = c;
        }
        else{
            max = a;
        }
*/
        int max = Math.max(c , Math.max(a,b));
        System.out.println("Greatest number is : " + max);
    }
}
