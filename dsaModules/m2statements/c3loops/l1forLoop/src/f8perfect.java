import java.util.Scanner;
public class f8perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = input.nextInt();
        int sum = 0;
        for(int i=1; i<=(num/2); i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("not Perfect Number");
        }
    }
}
