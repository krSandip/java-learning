import java.lang.annotation.*;
import java.lang.reflect.Method;

@MyAnn(name = "JavaUser", value = "alpha")
public class r5annotationDemo {
    public r5annotationDemo(){
        System.out.println("hello 0");
    }

//    @MyAnn(name = "JavaUser", value = "alpha")
    @Deprecated
    void helloWorld(){System.out.println("hello void void");}
    private String helloWorld(int i){System.out.println("hello "+i);return "str success";}

}

class testDemo3 {
    public static void main(String[] args) {
        try{
            r5annotationDemo d = new r5annotationDemo();
            Method[] m = d.getClass().getDeclaredMethods();
            for(Method m1 : m){
                Annotation[] an = m1.getAnnotations();
                for(Annotation an1 : an){
                    System.out.println("the annotation is " +an1.toString());
                }
            }

            // at the class level
            Annotation[] an2 = d.getClass().getAnnotations();
            for(Annotation an1 : an2){
                System.out.println("the class annotation is " +an1.toString());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.METHOD)
@interface MyAnn{
    String name();
    String value();
}