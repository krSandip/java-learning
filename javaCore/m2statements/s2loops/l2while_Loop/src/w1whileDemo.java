public class w1whileDemo {
    public static void main(String[] args) {
        /*
        syntax of while loop
        while(condition){
        // body
        }
        */

        //1st while
        int i =3;
        System.out.println("1st while demo ");
        while(i< 5){
            System.out.println(" value of i is "+i);
            i++;
        }

        //2nd while
        int j =0;
        System.out.println("2nd while demo ");
        while(true){
            if(j >= 5) break;
            System.out.println(" value of j is "+j++);
        }

        //3rd while
        int k =0;
        do{
            System.out.println(" value of k is "+k++);
        }while(k >=5);

        int num =1;
        while(num<=10){
            System.out.println(num);
            num++;
        }
    }
}
