public abstract class a1animal {
    // 1 - concept
    public abstract void makeSound();
    public void sleep(){
        System.out.println("I am sleeping");
    }

    // 2 - can we put variables also ? YES
    int age;

    // 3 - can we put constructor ?  YES, but while creating objects we must override the methods otherwise no
    public a1animal(int age){
        this.age = age;
    }

    // 4 - can we construct abstract constructors ? NO
//    public abstract a1animal(int age){
//        this.age = age;
//    }

    // 5 - can we construct abstract static methods ? NO
//    abstract static staticMethod(int age){
//        this.age = age;
//    }

    // 6 - static method inside abstract class
    static void staticMethod(){
        System.out.println("this is static method inside abstract class");
    }

    // 7 - normal methods
    void normal(){
        System.out.println("this is a normal method inside abstract class");
    }

    // 8 - we can not put final keyword in abstract classes
    // 9 - final or static variables
//    final int value1;
//    static int value2;
//    public a1animal(){
//        value1 = 20;
//        value2 = 30;
//    }
}
