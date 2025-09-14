public class n1nestedDemo {
    class nestedClass{
        void printInnerMethod(){
            System.out.println("Reached in the nested class ");
        }
    }
    public static void main(String args[]){
        n1nestedDemo.nestedClass n = new n1nestedDemo().new nestedClass();
        n.printInnerMethod();

    }
}

