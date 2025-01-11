package OOPS.Interfaces;

public class Vehicle implements Engine, Brake  {

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
}
