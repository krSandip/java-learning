import java.lang.reflect.Field;

public class r3fieldDemo {
    private int intField = 10;
    public String strField = "hello";
    public r3fieldDemo(){
        System.out.println("hello 0");
    }

//    public static void main(String[] args) {
//        try{
//            r3fieldDemo d = new r3fieldDemo();
//            d.intField = 10;
//            d.strField = "testJava";
//            r3fieldDemo d2 = new r3fieldDemo();
//            d2.intField = 20;
//            d2.strField = "javaTest12";
//
//            Field[] f = d.getClass().getFields();
//            for(Field f1 : f){
//                System.out.println("the field is " +f1.getName()+ " :: " +f1.get(d));
//            }
//            f = d.getClass().getDeclaredFields();
//            for(Field f1 : f){
//                System.out.println("the declaredField is " +f1.getName()+ " :: " +f1.get(d2));
//            }
//            Field f3 = d2.getClass().getField("strField");
//            f3.set(d2, "hello string");
//            System.out.println("value of d2 now is " +f3.get(d2));
//        }catch (Exception e){
//
//        }
//    }
}

class testDemo{
    public static void main(String[] args) {
        // not accessible
//        try {
//            r3fieldDemo d = new r3fieldDemo();
//            Field f = d.getClass().getDeclaredField("intField");
//            System.out.println("value of intField is " +f.get(d));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        // accessibility
        try {
            r3fieldDemo d = new r3fieldDemo();
            Field f = d.getClass().getDeclaredField("intField");
            f.setAccessible(true);
            System.out.println("value of intField is " +f.get(d));
            f.set(d, 60);
            System.out.println("value of intField now is " +f.get(d));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}