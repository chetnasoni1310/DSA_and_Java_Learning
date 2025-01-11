package OOPS.Abstraction;

public abstract class Car {
     
    abstract void Engine();
    abstract void Media();
    abstract void Brake();

    public Car() {

    }  
    String name;
        public Car(String name) {
            this.name=name;

        }
}
