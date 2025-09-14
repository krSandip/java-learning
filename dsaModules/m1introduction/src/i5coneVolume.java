// Q : volume of cone
import java.util.Scanner;
public class i5coneVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter radius : ");
        float R = input.nextInt();
        System.out.print("enter height : ");
        float H = input.nextInt();

        double V = (1.0/3.0) * ( (22.0/7.0) * R * R * H);
        System.out.println("Area of cone is : " +V);
    }
}