public class s1human {
    String name;
    int age;
    int salary;
    boolean married;
    // this is a static variable, it is common to all reference variables of s1human class
    static int population;

    public s1human(String name, int age, int salary, boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;

        s1human.population+=1;
    }
}
