import java.io.IOException;

public class e4userDefinedException {
    public static void main(String args[]){
        method1();

    }
    static void method1(){
        method2();
    }
    static void method2(){
        int[] sugarData = new int[]{80,90,67,132,110};
        for (int i : sugarData){
            try{

                testSugar(i);
                System.out.println("Sugar is fine for "+i);

            }
            catch(LowSugarException | HighSugarException | IOException lsex){
                System.out.println(" The issue with the patient is "+lsex.getMessage());
                lsex.printStackTrace();
            }

            catch(Exception e){
                System.out.println(" Some exception has happened");
            }
        }
    }
    public static void testSugar(int val) throws LowSugarException,HighSugarException,IOException{
        if(val < 70){
            throw new LowSugarException("The sugar is low");
        } else if(val >=70 && val <=130 ){
            ///System.out.println("The sugar is fine");
        }else {
            throw new HighSugarException("The sugar is high");
        }
    }
}

class LowSugarException extends Exception{
    public LowSugarException(String message){
        super(message);
    }
}
class HighSugarException extends Exception{
    public HighSugarException(String message){
        super(message);
    }
}