package OOPS.Interfaces;

public class CDplayer implements MediaPlayer {

    @Override
    public void play() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
