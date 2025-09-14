import java.util.Scanner;
public class f12pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers : ");
        int x1 =in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();

        System.out.println(isTriplet(x1, x2, x3));

    }

    static boolean isTriplet(int n1, int n2, int n3){
        if(n1*n1 == n2*n2 + n3*n3){
            return true;
        }
        else if(n2*n2 == n1*n1 + n3*n3){
            return true;
        }
        else if(n3*n3 == n1*n1 + n2*n2){
            return true;
        }
        else{
            return false;
        }
    }
}


