// Q : Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;
public class f7hcfLcm {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the two numbers : ");
        int n1=input.nextInt();
        int n2=input.nextInt();
        int max=0;
        if(n1>n2){
            max=n1;
        }
        else{
            max=n2;
        }
        // System.out.println(max);

        for(int i=max; i>=1; i--){
            if(n1%i==0 && n2%i==0){
                System.out.println("HCF : " +i);
                break;
            }
        }
        for(int i=max; i<=(n1*n2); i++){
            if(i%n1==0 && i%n2==0){
                System.out.println("LCM : " +i);
                break;
            }
        }
    }
}
