import java.util.Scanner;

public class f1forDemo {
    public static void main(String[] args) {
        /*
        syntax of a for loop
        for(initialisation; condition; increment){
        // body
        }
        */

        //1st for
        System.out.println("1st for demo ");
        for(int i=0; i< 5; i++){
            System.out.println(" value of i is "+i);
        }

        //2nd for
        System.out.println("2nd for demo ");
        for(int j=0; ; j++){
            if(j >= 5) break;
            System.out.println(" value of j is "+j);
        }

        //3dd for
        System.out.println("3rd for demo ");
        for(int k=0; ; ){
            if(k >= 5) break;
            System.out.println(" value of k is "+k);
            k++;
        }

        //  Q :  Print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number till which you want to print : ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
