package OOPS.Interfaces;

public class NiceCar {
    private Engine engine;
    private MediaPlayer player=new CDplayer();

    public NiceCar()
    {
        engine=new PowerEngine();
    }

    public NiceCar(Engine engine)
    {
        this.engine=engine;
    }


//For Engineeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
    public void start()
    {
        engine.start();
    }
    public void stop()
    {
        engine.stop();
    }



    //for Media Playerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
    public void startMusic()
    {
        player.play();
    }
    public void stopMusic()
    {
        player.stop();
    }

    //Upgrade Engineeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
    public void UpgradeEngine(Engine engine)
    {
        this.engine=engine;
    }
}
