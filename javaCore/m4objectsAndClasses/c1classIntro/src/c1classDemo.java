
// create class
public class c1classDemo {
    // instance variables or fields or attributes of different objects - defines the object identity
    int rno;
    String name;
    float marks;

    // methods or constructors
    c1classDemo() {
        // this keyword
        this.rno = 29;
        this.name = "sandeep";
        this.marks = 90;
    }

    // constructor overloading
    c1classDemo(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        // creating objects - declaring and initialising different objects of c1classDemo class
        // use of new keyword
        c1classDemo student1 = new c1classDemo();
        c1classDemo student2 =  new c1classDemo(20, "rahul", 95);
        // accessing instance variable using (.) operator
        System.out.println(student1.name);
    }
}
