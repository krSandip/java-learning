public class s3diffScoppings {
    public static void main(String[] args) {
        // case 1 (static inside static)
        message1();
    }

    static void message1(){
        // case 2 (non-static inside static)
        // message2();
        // here this is not possible because message2 is a non-static variable
        // which depends on objects, but message1 is a static variable(independent of objects)

        // case 3 (non-static inside static, but creating objects)
        // we can access it by creating object for that
        s3diffScoppings obj = new s3diffScoppings();
        obj.message2();
    }

    void message2(){
        System.out.println("this is non-static variable from message2");

        // case 4 (static inside non-static)
        // message1();
        // it is possible

        // case 5 (non-static inside non-static)
        message3(); // this is also possible
    }

    void message3(){
        System.out.println("this is non-static variable from message3");
    }
}
