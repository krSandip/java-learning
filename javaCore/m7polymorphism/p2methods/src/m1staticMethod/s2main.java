package m1staticMethod;

public class s2main {
    //    int sum(int a, int b){
//        return a+b;
//    }
//
//    int sum(int a, int b, int c){
//        return a+b+c;
//    }

    public static void main(String[] args) {
        s1overloading obj1 = new s1overloading();
        int result1 = obj1.sum(10, 20);
        int result2 = obj1.sum(1,2,3);

        System.out.println(result1);
    }
}
