package OOPS.Abstraction;

public class Ferrari extends Car{

    public Ferrari() {

    }
    public Ferrari(String name)
    {  
        super(name);
                                        //  Need kya hai fir 
        //  this.name=name;
        //  System.out.println();
        //  System.out.println("Ferrr");
        //  System.out.println(name);
    }
      @Override
    void Engine()
    { System.out.println("I am ferrari engineeee yyyy");
    }

    @Override
    void Media() {
        System.out.println("I am ferrari Media player yyyy");
    }

    @Override
    void Brake() {
        System.out.println("I am ferrari brakesssssss yyyy");
    }
}
