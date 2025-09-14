public class s4staticBlock {
    static int a = 5;
    static int b;

    static{
        System.out.println("i am in static block");
        b = a * 10;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
        b += 20;
        System.out.println(a + " " + b);
    }
}
