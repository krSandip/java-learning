public class s2main {
    public static void main(String[] args) {
        s1human human1 = new s1human("sandeep", 20, 100000, false);
        s1human human2 = new s1human("anup", 19, 200000, false);
        s1human human3 = new s1human("yogesh", 21, 300000, false);


        System.out.println(human2.salary);

        // here population is a static variable and it is common for all human (human1, human2, human3)
        System.out.println(s1human.population);
    }
}
