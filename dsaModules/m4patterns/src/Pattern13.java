public class Pattern13 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row=1; row<=n; row++){
            for(int s=1; s<=n-row; s++){
                System.out.print(" ");
            }
            //int col = n-row+1;
            if(row<n){
                for(int col=n-row+1; col>n-row; col--) {
                    System.out.print("*");
                }
            }
            else {
                for (int col = n; col >= n - row; col--) {
                    System.out.print("*");
                }
            }
            if(row>1 && row<n){
                for(int s=n-row+2; s<=n+row-2; s++){
                    System.out.print(" ");
                }
            }
            if(row>1 && row<n){
                for(int col=n+row-1; col<n+row; col++){
                    System.out.print("*");
                }
            }
            if(row==5){
                for(int col=n+1; col<2*n-1; col++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
