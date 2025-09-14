import java.util.Scanner;

public class s2nestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first id : ");
        int id = input.nextInt();

        switch(id){
            case 1 :
                System.out.println("Rahul Singh");
                break;
            case 2 :
                System.out.println("Aniket Verma");
                break;
            case 3 :
                System.out.print("Please Enter your Department id : ");
                int id2= input.nextInt();
                switch(id2){
                    case 1:
                        System.out.println("Nikhil Sharma");
                        break;
                    case 2 :
                        System.out.println("Aditya Kumar");
                        break;
                    case 3 :
                        System.out.println("Sanddep Raina");
                        break;
                    default :
                        System.out.println("Please enter the correct id");
                        break;
                }
                break;
            case 4:
                System.out.println("Anup Maurya");
                break;
            default :
                System.out.println("Please enter the correct id - ThankYou");
                break;
        }
    }
}
