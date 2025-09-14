public class Pattern14 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row =1; row<=n; row++){
            if(row==1){
                for(int col=1; col<2*n; col++){
                    System.out.print("*");
                }
            }
            else if(row>1 && row<n){
                for(int s=1; s<2*n; s++){
                    if(s==row || s==2*n-row-1){
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
            }
            else{
                for(int s=1; s<2*n; s++){
                    if(s==row){
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

