// Q : Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd
//  numbers from a list of numbers (N) entered by the user.The list terminates when the user enters a zero.

import java.util.Scanner;
public class w6sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the numbers : ");
        int sum_negative = 0;
        int sum_even = 0;
        int sum_odd = 0;
        while(true){
            int x = input.nextInt();
            if(x<0){
                sum_negative+=x;
            }
            if(x>0 && x%2==0){
                sum_even+=x;
            }
            if(x>0 && x%2!=0){
                sum_odd+=x;
            }
            if(x==0){
                break;
            }
        }
        System.out.println("sum of negative numbers : " +sum_negative);
        System.out.println("sum of positive even numbers : " +sum_even);
        System.out.println("sum of positive odd numbers : " +sum_odd);
    }
}

