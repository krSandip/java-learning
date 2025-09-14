import java.lang.reflect.Constructor;

public class r2constructorDemo {
    public r2constructorDemo(){
        System.out.println("hello 0");
    }
    public r2constructorDemo(int i) {
        System.out.println("hello 1");
    }
    public r2constructorDemo(int i, int j) {
        System.out.println("hello 2");
    }

    public static void main(String[] args) {
        try {
            String className = "r2constructorDemo";
            Class testClass = Class.forName(className);
            Constructor[] c = testClass.getConstructors();
            for (Constructor c1 : c) {
                System.out.println("And cons is " + c1.getName());
            }
            Constructor c2 = testClass.getConstructor(new Class[]{int.class});
            System.out.println("And cons with int is " + c2.getName());
            r2constructorDemo d = (r2constructorDemo) c2.newInstance(2, 4);
        } catch (Exception e) {
        }
    }
}
