public class n1A {
    public interface nestedInterface{
        void method1();
    }
}

class B implements n1A.nestedInterface{
    @Override
    public void method1(){
        System.out.println("this is method of nestedInterface");
    }
}

