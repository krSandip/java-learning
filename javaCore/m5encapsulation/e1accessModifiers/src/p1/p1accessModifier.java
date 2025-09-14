package p1;

public class p1accessModifier {
    // variables
    public String name;
    protected float marks;
    int age;  // default
    private boolean isPass;

    // constructor
    public p1accessModifier(String name, float marks, int age, boolean isPass){
        this.name = name;
        this.marks = marks;
        this.age = age;
        this.isPass = isPass;
    }

    // getters
    public boolean getResult(){
        return isPass;
    }
    // setter
    public void setResult(boolean isPass){
        this.isPass = isPass;
    }

    public static void main(String[] args) {
        p1accessModifier obj = new p1accessModifier("sandeep", 85.5f, 20, true);
        System.out.println(obj.name); // public : possible
        System.out.println(obj.marks); // protected : possible
        System.out.println(obj.age); // default : possible
        System.out.println(obj.isPass); // possible
        // here all type of modifiers are accessible
    }
}
