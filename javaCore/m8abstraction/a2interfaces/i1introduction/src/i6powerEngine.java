public class i6powerEngine implements i1engine{

    @Override
    public void startEngine(){
        System.out.println("power engine start");
    }
    @Override
    public void accEngine(){
        System.out.println("power engine accelerate");
    }
    @Override
    public void stopEngine(){
        System.out.println("power engine stop");
    }
}
