import java.util.Scanner;

public class s1switch {
    public static void main(String[] args) {
        int i = 15;
        switch(i){
            case 1: System.out.println(i);
                break;
            case 2: System.out.println(i);
                break;
            case 10: System.out.println(i);
                break;
            default: System.out.println("default");
                break;

        }

        Scanner input = new Scanner(System.in);
        System.out.print("enter the day number : ");
        int day = input.nextInt();
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
