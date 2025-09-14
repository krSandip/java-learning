public class r1classDemo {
    public static void main(String[] args) {
        try {
            r1classDemo obj = new r1classDemo();
            System.out.println("obj's class is ::" + obj.getClass());
            String className = "java.lang.String";
            Class testClass = Class.forName(className);
            System.out.println("new class is " + testClass.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
