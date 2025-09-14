import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//custom annotation use
@customAnnotation(name = "Peter")
public class a1annotationDemo {

    // inherited
    @customAnnotation(name = "Peter")
    a1annotationDemo(){}

    @Deprecated
    void test(){
        System.out.println("hello annotations...");
    }

    public static void main(String[] args) {
        a1annotationDemo obj = new a1annotationDemo();
        obj.test();
        subClass obj2 = new subClass();
        obj2.test();
    }
}

// in-built annotations
class subClass extends a1annotationDemo{
    @Override
    void test(){
        @SuppressWarnings("unused...")
        int i=0;
        System.out.println("hello anno, Im in sub class...");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
// custom annotation creation
@interface customAnnotation{
    String name();
    int id() default 2;
}