public class a3cat extends a1animal{
    // 1 - concept
    @Override
    public void makeSound() {
        System.out.println("Meou...");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    // 2 - variables
//    public a3cat(int age){
//        this.age = age;
//    }

    // 3 - constructor
    public a3cat(int age) {
        super(age);
    }
}
