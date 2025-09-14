import java.util.Scanner;
public class f1sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter x : ");
        int x = input.nextInt();
        System.out.println("enter y : ");
        int y = input.nextInt();
        int result = sum(x,y);
        System.out.print("Sum : " +result);
    }

    static int sum(int a, int b){
        int add = a + b;
        return add;
    }
}
