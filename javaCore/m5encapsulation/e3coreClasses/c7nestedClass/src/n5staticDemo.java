public class n5staticDemo {
    public static void main(String[] args) {
        StaticOuter.StaticNested  i= new StaticOuter.StaticNested();
        i.printStr();
    }
}

class StaticOuter{
    static String str123="Static Outer";
    static class StaticNested{
        static void printStr(){
            System.out.println("Inside the nested class ");
        }
    }
}