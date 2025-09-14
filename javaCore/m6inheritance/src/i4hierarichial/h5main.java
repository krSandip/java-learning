package i4hierarichial;

public class h5main {
    public static void main(String[] args) {
        h2human human1 = new h2human("sandeep", 20, 50000);
        h2human human2 = new h2human("anoop", 19, 60000);
        h3animals animal1 = new h3animals("dog", 10, "housekeeping");
        h3animals animal2 = new h3animals("horse", 15, "running");
        h4birds bird1 = new h4birds("pigeon", 2, "postman");
        h4birds bird2 = new h4birds("sparrow", 3, "noiseMaker");

        System.out.println(human1.salary);
    }
}
