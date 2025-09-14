// Q : Find Ncr & Npr
import java.util.Scanner;
public class f9pnc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = input.nextInt();
        System.out.print("enter r : ");
        int r = input.nextInt();
        int fac_n = 1;
        for(int i=1; i<=n; i++){
            fac_n *= i;
        }

        int fac_r = 1;
        for(int i=1; i<=r; i++){
            fac_r *= i;
        }

        int fac_nr = 1;
        for(int i=1; i<=(n-r); i++){
            fac_nr *= i;
        }

        int nCr = (fac_n)/((fac_r)*(fac_nr));
        int nPr = (fac_n)/(fac_nr);

        System.out.println("Combinations : " +nCr);
        System.out.println("Permutations : " +nPr);

    }
}

