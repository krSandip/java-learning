import java.util.Scanner;

public class c1calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        //char op = input.next().trim().charAt(0);
        System.out.println("Click x or X to exit! ");
        while(true){
            System.out.print("Enter the operator : ");
            char op = input.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.print("Enter the first number : ");
                int num1 = input.nextInt();

                System.out.print("Enter the second number : ");
                int num2 = input.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2!=0 && num1 > num2){
                        ans = num1/num2;
                    }
                    else{
                        ans = 0;
                    }
                }
                if(op == '%'){
                    if(num1>num2){
                        ans = num1 % num2;
                    }else{
                        ans = 0;
                    }
                }
                System.out.println("Answer is : " +ans);
            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operation !!");
            }
        }
    }
}

