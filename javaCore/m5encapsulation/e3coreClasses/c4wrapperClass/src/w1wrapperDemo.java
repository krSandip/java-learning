//java.lang.Integer

public class w1wrapperDemo {
    public static void main(String args[]){
        int i = 5;
        Integer I = new Integer(0);
        boolean b = true;
        Boolean B = new Boolean(true);

        // boxing
        I = i;
        System.out.println("value of I is " +I);

        // unboxing
        i = I;
        System.out.println("value of i is "+i);

    }

}
