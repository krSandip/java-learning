public interface A {
    // case - 1
    void method1();

    // case - 2
    default void message(){
        System.out.println("I am default");
    }
}
