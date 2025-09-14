public class Pattern11 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row =1; row<=n; row++){
            int totalNoCol = n-row+1;
            int totalNoSpace = row-1;
            for(int s=1; s<=row-1; s++){
                System.out.print(" ");
            }

            for(int col=n; col>row-1; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
