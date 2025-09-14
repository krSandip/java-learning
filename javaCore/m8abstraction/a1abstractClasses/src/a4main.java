public class a4main {
    public static void main(String[] args) {
        // 1 - concept
//        a2dog dog = new a2dog();
//        a3cat cat = new a3cat();
//        dog.makeSound();
//        dog.sleep();
//        cat.makeSound();
//        cat.sleep();

        // 2 - variables
//        a2dog dog = new a2dog(10);
//        a3cat cat = new a3cat(7);
//        dog.makeSound();
//        cat.sleep();
//        System.out.println(cat.age);

        // 3 - can we create objects of abstract class ( animal )
        // we can not create objects directly as follows :
        //a1animal animal = new a1animal(20);
        // but can be possible like that as follows :
        a1animal animal = new a1animal(12) {
            @Override
            public void makeSound() {
                System.out.println("bhou..bhou..");
            }
            @Override
            public void sleep(){
                System.out.println("I am cat and I am sleeping");
            }
        };
        animal.makeSound();
        animal.sleep();
        System.out.println(animal.age);

        // 6 - static method
//        a1animal.staticMethod();

        // 7 - normal
//        a2dog dog = new a2dog();
//        dog.normal();
//        System.out.println(a1animal.value2);
    }
}
