// Q : Calculate distance between two points

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class i3distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the coordinates of point A : ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.print("enter the coordinates of point B : ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        double distance = sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("distance between A and B is : " +distance);
    }
}

