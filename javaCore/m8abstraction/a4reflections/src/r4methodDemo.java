import java.lang.reflect.Method;
public class r4methodDemo {
//    private int intField = 10;
//    public String strField = "hello";
//    public r4methodDemo(){
//        System.out.println("hello 0");
//    }
    void helloWorld(){
        System.out.println("hello void method");
    }
//    String helloWorld2(int i){
//        System.out.println("hello " +i);
//        return "str success";
//    }
    private String helloWorld2(int i){
        System.out.println("hello " +i);
        return "str success";
    }
}

class testDemo2{
    public static void main(String[] args) {
        try{
            // getting all methods and declared methods
            r4methodDemo d = new r4methodDemo();
//            Method[] m = d.getClass().getMethods();
            Method[] m = d.getClass().getDeclaredMethods();
            for(Method m1 : m){
                System.out.println("m is " +m1.getName());
            }

            // getting specified method
//            Method m2 = d.getClass().getDeclaredMethod("helloWorld", null);
            Method m3 = d.getClass().getDeclaredMethod("helloWorld2", new Class[]{int .class});
            m3.setAccessible(true);
            System.out.println("m3 is " +m3.getName()+ " :: " +m3.getReturnType());

            // invoking methods
            Object retVal = m3.invoke(d, new Object[]{20});
            System.out.println("retVal is "+retVal);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}