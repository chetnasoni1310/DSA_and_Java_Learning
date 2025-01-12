package OOPS.Interfaces;

public class Vehicle implements Engine, Brake,MediaPlayer  {

    @Override
    public void brake() {
       System.out.println("Car brake");
    }

    @Override
    public void start() {
        System.out.println("Car start");

    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public void acc() {
        System.out.println("Car acc");
    }

    @Override
    public void play() {
        System.out.println("Music start");
    }

//
//    @Override
//    public void pause() {
//        System.out.println("Music stop");
//    }
}
