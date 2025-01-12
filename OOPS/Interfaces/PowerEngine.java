package OOPS.Interfaces;


public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Pwer Engine strt");
    }

    @Override
    public void stop() {
        System.out.println("Pwer Engine stop");

    }

    @Override
    public void acc() {
        System.out.println("Pwer Engine accelerate");

    }
}
