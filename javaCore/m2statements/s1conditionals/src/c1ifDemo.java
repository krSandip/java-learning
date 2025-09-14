import java.util.Scanner;

public class c1ifDemo {
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

        int i =20;
        //1st If
        if(i==20){
            System.out.println("Inside 1st if loop");
        }

        //2nd If
        if(i>20){
            System.out.println("Inside 2nd if loop");
        }
        else{
            System.out.println("Inside 2nd else loop");
        }

        //3rd if
        if(i>20){
            System.out.println("Inside 3rd if loop");
        }
        else if(i> 10){
            System.out.println("Inside 3rd else if loop");
        }
        else {
            System.out.println("Inside 3rd else loop");
        }

//        example
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
