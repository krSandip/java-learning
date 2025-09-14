package package1;

import static package2.message.response1;
import static package2.message.response2;

public class message {
    public static void main(String[] args) {
        System.out.println("hello, java file of package p2");
        response1();
        System.out.println("I am accessing you by using packages in java");
        response2();
        System.out.println("thank you, for your response");
    }
}
