public class a2dog extends a1animal{
    // 1 - concept
    @Override
    public void makeSound() {
        System.out.println("bhouu..");
    }
    @Override
    public void sleep() {
        super.sleep();
    }

    // 2 - variables
//    public a2dog(int age){
//        this.age = age;
//    }

    // 3 - constructor
    public a2dog(int age){
        super(age);
    }

    // 7- normal
    @Override
    void normal(){
        super.normal();
    }
}
