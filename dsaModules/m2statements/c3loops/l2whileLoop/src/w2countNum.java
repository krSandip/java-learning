import java.util.Scanner;
public class w2countNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q : count the number of times a given number occurs in the given number

        System.out.print("enter the number : ");
        long N = input.nextInt();
        System.out.println("enter the number which is to be counted");
        int n = input.nextInt();
        int count = 0;
        while(N>0){
            if(N%10 == n){
                count = count + 1;
            }
            N = N / 10;
        }
        System.out.println("number " +n+ " occurs " +count+ " times");
    }
}
