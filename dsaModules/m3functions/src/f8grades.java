import java.util.Scanner;
public class f8grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the marks : ");
        int marks = in.nextInt();
        fxn(marks);

    }

    static void fxn(int x){
        if(x>90 && x<101){
            System.out.println("AA");
        }
        else if(x>80 && x<91){
            System.out.println("AB");
        }
        else if(x>70 && x<81){
            System.out.println("BB");
        }
        else if(x>60 && x<71){
            System.out.println("BC");
        }
        else if(x>50 && x<61){
            System.out.println("CD");
        }
        else if(x>40 && x<51){
            System.out.println("DD");
        }
        else{
            System.out.println("FAIL");
        }

    }
}

