// Q :

import java.util.Scanner;

import static java.lang.Math.pow;

public class i2depreciation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter initial value : ");
        int V1 = input.nextInt();
        System.out.print("enter time : ");
        int T = input.nextInt();
        System.out.print("enter rate : ");
        float R = input.nextFloat();

        double V2= V1 * pow((1 - (R/100)) , T);

        System.out.println("Depreciation value : " +V2);
    }
}
