public class e1exceptionDemo {
    public static void main(String[] args) {
        int num = 25;
        try{
            for (int i =25; i>=0;i--){
                if(num%i == 0)
                    System.out.format("%s divides %s \n",i,num);
            }
        }
        catch(Exception e){
            System.out.println("Some execption has happened and we are inside the exception block");
//            ArithmeticException ae= new ArithmeticException("Error has happened");
//            ae.initCause(e);
//            throw ae;
        }
        finally {
            System.out.println("We are inside the finally block");
        }
    }
}
