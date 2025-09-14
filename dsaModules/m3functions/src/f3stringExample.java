import java.util.Scanner;
public class f3stringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String Name = in.nextLine();
        String message = greet(Name);
        System.out.println(message);
    }

    static String greet(String name){
        String greeting = "hello..." +name;
        return greeting;
    }
}
