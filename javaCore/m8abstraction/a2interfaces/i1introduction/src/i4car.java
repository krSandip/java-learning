public class i4car implements i1engine, i2brake{
    @Override
    public void startEngine(){
        System.out.println("starts the car");
    }
    public void startMusic(){
        System.out.println("starts the music");
    }

    @Override
    public void accEngine(){
        System.out.println("accelerate the car");
    }

    @Override
    public void brake(){
        System.out.println("brakes the car");
    }

    @Override
    public void stopEngine(){
        System.out.println("stops the engine");
    }

    public void stopMusic(){
        System.out.println("stops the music");
    }
}
