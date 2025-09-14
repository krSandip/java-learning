public class Pattern12 {
    public static void main(String[] args) {
        pattern1(5);

        pattern2(5);
    }
    static void pattern1(int n){
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
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int s=1; s<=n-row; s++){
                System.out.print(" ");
            }

            for(int col=n; col>n-row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
