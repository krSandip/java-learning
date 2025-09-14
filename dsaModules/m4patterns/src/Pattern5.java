public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<=2*n-1; row++){
            int col;
            if(row>n){
                for(col=1; col<=2*n-row; col++){
                    System.out.print("* ");
                }
            }
            else{
                for(col=1; col<=row; col++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

