import java.util.Scanner;
public class f1introduction {
    public static void main(String[] args) {
        /*
        syntax of a for loop
        for(initialisation; condition; increment){
        // body
        }
        */

        //  Q :  Print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number till which you want to print : ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
