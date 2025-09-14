
public class n2memberDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.printStr();
    }
}

class Outer{
    private String str="Outer String";
    class Inner{
        String str= "Inner String";
        void printStr(){
            System.out.println("The value of inner's str is "+str);
            System.out.println("The value of outer's str is "+Outer.this.str);
        }
    }
}