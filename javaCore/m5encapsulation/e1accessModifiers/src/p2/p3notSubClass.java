package p2;
import p1.p1accessModifier;

public class p3notSubClass {
    public static void main(String[] args) {
        // outside world
        // different class, different package
        p1accessModifier obj1 = new p1accessModifier("sandeep", 85.5f, 20, true);
        System.out.println(obj1.name); // public : possible
//        System.out.println(obj1.marks);
//        // protected : not possible
//        System.out.println(obj1.age);
//        // default : not possible
//        System.out.println(obj1.isPass);
        // private : not possible

        // getters and setters for private
        boolean result = obj1.getResult();
        System.out.println(result);

        // using subclass in different class of different package
        p2subClass obj2 = new p2subClass("sandeep", 85.5f, 20, true, "sliet");
        System.out.println(obj2.name); // public : possible
//        System.out.println(obj2.marks);
//        // protected : not possible ( acts as outside world )
//        System.out.println(obj2.age);
//        // default : not possible
//        System.out.println(obj2.isPass);
//        // private : not possible
    }
}
