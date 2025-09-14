import java.util.Scanner;
public class f13voteEligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age = in.nextInt();

        vote(age);

    }

    static void vote(int x){
        if(x>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}

