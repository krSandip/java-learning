import java.util.Scanner;
public class c1introduction {
    public static void main(String[] args) {
        /*
        Syntax for if else statements

        if(condition){
            //body
        }
        else{
           //do this
        }
        */

        Scanner input = new Scanner(System.in);
        System.out.print("enter your current salary : ");
        int salary = input.nextInt();

        if (salary > 10000){
            salary = salary + 2000;
        }
        else{
            salary = salary + 1000;
        }

        System.out.println("new salary is" +salary);
    }
}

