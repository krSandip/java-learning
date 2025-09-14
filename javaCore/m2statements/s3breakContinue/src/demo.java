public class demo {
    public static void main(String[] args) {
        //1st break
        int k =0;
        System.out.println("1st break demo ");
        while(true){
            if(k >= 5) break;
            System.out.println(" value of k is "+k++);
        }

        //2nd break
        test1: for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j > 2) break test1 ;
                System.out.println(" value of i & j is "+i+" & "+j);
            }
        }

        //        //1st continue
//        int k =0;
//        System.out.println("1st continue demo ");
//        while(k < 5){
//            if(k == 2) continue;
//            System.out.println(" value of k is "+(k++));
//        }

        //2nd continue
        test1: for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j > 1) continue test1 ;
                System.out.println(" value of i & j is "+i+" & "+j);

                if(i > 2) break test1;
            }
        }
    }
}
