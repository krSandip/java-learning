public class o1objectDemo {
    int num1;
    o1objectDemo(int num1){
        this.num1 = num1;
        //this.num2 = num2;
    }

    @Override
    public int hashCode(){
        //return super.hashCode();
        return num1;
    }

    @Override
    public boolean equals(Object obj){
        //return super.equals(obj);
        return this.num1 == ((o1objectDemo)obj).num1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable{
//        super.finalize();
//    }

    public static void main(String[] args) {
        // hashCode() method
        o1objectDemo obj1 = new o1objectDemo( 40);
        o1objectDemo obj2 = new o1objectDemo( 20);
        o1objectDemo obj3 = obj2;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        // equals() method
        o1objectDemo obj4 = new o1objectDemo( 40);
        o1objectDemo obj5 = new o1objectDemo( 40);
//        if(obj4 < obj5){
//            System.out.println("obj4 is less than obj5");
//        }
        if(obj4 == obj5){
            System.out.println("these are equal");
        }
        if(obj4.equals(obj5)){
            System.out.println("these are equal");
        }

        // instanceof operator
        System.out.println(obj4 instanceof o1objectDemo);

        // getCLass
        System.out.println(obj4.getClass());
    }
}
