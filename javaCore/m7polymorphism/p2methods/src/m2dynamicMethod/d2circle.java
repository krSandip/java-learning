package m2dynamicMethod;

public class d2circle extends d1shape{
    // this will run when the object of circle is created
    // hence this is overriding the shape class
    @Override
    void area(){
        System.out.println("area of circle : 0.5 * 3.14 * r");
    }
}
