package p2;

import p1.p1accessModifier;

public class p2subClass extends p1accessModifier {
    String college;
    p2subClass(String name, float marks, int age, boolean isPass, String college){
        super(name, marks, age, isPass);
        this.college = college;
    }

    public static void main(String[] args) {
        // subclass of different package
        p2subClass obj = new p2subClass("sandeep", 85.5f, 20, true, "sliet");
        System.out.println(obj.name); // public : possible
        System.out.println(obj.marks); // protected : possible
//        System.out.println(obj.age);
//        // default : not possible
//        System.out.println(obj.isPass);
//        // private : not possible
    }
}
