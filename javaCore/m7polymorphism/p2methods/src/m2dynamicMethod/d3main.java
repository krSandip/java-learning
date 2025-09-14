package m2dynamicMethod;

public class d3main {
    public static void main(String[] args) {
        d1shape circle1 = new d2circle();

        // this will override the shape class
        circle1.area();
    }
}
