package p1;

public class p3main {
    public static void main(String[] args) {
        // same package, different class
        p1accessModifier obj1 = new p1accessModifier("sandeep", 85.5f, 20, true);
        System.out.println(obj1.name); // public : possible
        System.out.println(obj1.marks); // protected : possible
        System.out.println(obj1.age); // default : possible
//        System.out.println(obj1.isPass);
//        // private : not possible

        // getters and setters for private
        boolean result = obj1.getResult();
        System.out.println(result);

        // using subclass in different class of same package
        p2subClass obj2 = new p2subClass("sandeep", 85.5f, 20, true, "sliet");
        System.out.println(obj2.name); // public : possible
        System.out.println(obj2.marks); // protected : possible
        System.out.println(obj2.age); // default : possible
//        System.out.println(obj2.isPass);
//        // private : not possible
    }
}
