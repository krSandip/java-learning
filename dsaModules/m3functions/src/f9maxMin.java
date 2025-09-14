import java.util.Scanner;
public class f9maxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the three numbers");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        System.out.println("Largest : " +maximum(x,y,z));
        System.out.println("Smallest : " +minimum(x,y,z));
    }

    static int maximum(int a, int b,int c){
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }

    static int minimum(int a, int b, int c){
        int min = a;
        if(b<min){
            min =b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}

