public class i7electricEngine implements i1engine{
    @Override
    public void startEngine(){
        System.out.println("electric engine start");
    }
    @Override
    public void accEngine(){
        System.out.println("electric engine accelerate");
    }
    @Override
    public void stopEngine(){
        System.out.println("electric engine stop");
    }
}
