
public class l1lambdaFunctionDemo {
    public static void main(String[] args) {
        /*
        Lambda expressions in Java are a feature introduced in Java 8
        that allow you to write more concise
        and readable code by providing a clear and concise way to
        represent instances of single-method interfaces (functional interfaces).
        They are essentially a way to treat functionality
        as a method argument or to create small anonymous functions.

        Key Concepts of Lambda Expressions:
        Functional Interfaces:
        1 - A functional interface is an interface that has only one abstract method.
        2 - Examples include Runnable, Callable, Comparator, and the custom interfaces you might define.
        3 - Lambda expressions can be used to implement the abstract method of a functional interface.

        Example of Function Interface
        @FunctionalInterface
        interface MyFunctionalInterface {
            void doSomething();
        }

        Syntax of Lambda Expressions:
        A lambda expression has three main components:
        Parameters: The input parameters for the lambda expression.
        Arrow ('->'): Separates the parameters from the body.
        Body: The code that gets executed.
        (parameters) -> expression
        Example :
        (int a, int b) -> { return a + b; }
         */

//        //Examples of Lambda Expressions:
//        // 1 - with Collections :
//        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//        // Lambda expression for sorting names in reverse order
//        names.sort((a, b) -> b.compareTo(a));
//        // Lambda expression for printing each name
//        names.forEach(name -> System.out.println(name));

//        // 2 - with Functional Interfaces :
//        // Using a lambda expression to define the sayHello method
//        Greeting greeting = (name) -> System.out.println("Hello, " + name);
//        greeting.sayHello("Alice");

        calculator sum = (a, b) -> a+b;
        calculator sub = (a, b) -> a-b;
        calculator prod = (a, b) -> a*b;

        l1lambdaFunctionDemo obj = new l1lambdaFunctionDemo();
        System.out.println(obj.operate(3, 5, sum));
    }

    private int operate(int a, int b, calculator op){
        return op.operation(a, b);
    }
}

// A simple custom functional interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

interface calculator{
    int operation(int a, int b);
}
