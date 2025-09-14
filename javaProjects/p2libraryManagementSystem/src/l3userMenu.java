import java.util.Scanner;

public class l3userMenu {
    public static void main(String[] args) {
        String input="";
        Scanner sc = new Scanner(System.in);

        while(input != "5"){
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");

            System.out.println("Select The Following Options");
            System.out.println("Enter 1 To Add New Member : ");
            System.out.println("Enter 2 To Add New Book : ");
            System.out.println("Enter 3 To Issue A Book : ");
            System.out.println("Enter 4 To Return A Book : ");
            System.out.println("Enter 5 To Exit : ");
            input = processUserInput(sc.nextLine().toString());

        }
    }
    public static String processUserInput(String in) {
        String retVal="5";
        switch(in){
            case "1":
                System.out.println("---------------------------------------------------------");
                System.out.println("You Have Selected Option 1 To Add A New Member");
                l4addMemberMenu.addMemberMenu();
                return "1";
            case "2":
                System.out.println("---------------------------------------------------------");
                System.out.println("You Have Selected Option 2 To Add A New Book");
                l6addBookMenu.addBookMenu();
                return "2";
            case "3":
                System.out.println("---------------------------------------------------------");
                System.out.println("You Have Selected Option 3 To Issue A Book");
                l8libraryFunctions.callIssueMenu();
                return "3";
            case "4":
                System.out.println("---------------------------------------------------------");
                System.out.println("You Have Selected Option 4 To Return A Book");
                l8libraryFunctions.callReturnMenu();
                return "4";
            default:
                System.out.println("---------------------------------------------------------");
                System.out.println("Thanks For Visiting On This !!");
                return "5";
        }

    }
}

