public class r1pattern {
    public static void main(String[] args) {
        int r = 4;
        int c = 0;
        triangle(r,c);
        triangle2(r,c);
    }
    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print(" * ");
            triangle(r,c+1);
        }
        else{
            System.out.println();
            triangle(r-1, 0);
        }
    }
    static void triangle2(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle2(r,c+1);
            System.out.print(" * ");
        }
        else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }
}

