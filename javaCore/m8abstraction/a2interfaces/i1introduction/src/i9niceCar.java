public class i9niceCar {
    private i1engine engine;
    private i3media music = new i8cdPlayer();
    public i9niceCar(){
        engine = new i6powerEngine();
    }

    public i9niceCar(i1engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.startEngine();
    }

    public void stop(){
        engine.stopEngine();
    }

    public void startPlayer(){
        music.startMusic();
    }

    public void stopPlayer(){
        music.stopMusic();
    }

    public void upgradeEngine(){
        engine = new i7electricEngine();
    }
}
