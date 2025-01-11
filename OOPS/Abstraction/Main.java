package OOPS.Abstraction;

public class Main {

	public static void main(String[] args) {
         

          //possible

        Ferrari f=new Ferrari();
        f.Engine();
        f.Brake();
        f.Media();

          //possible

        Limo l=new Limo();
        l.Engine();
        l.Media();
        l.Brake();

                                        //imposssible
                                        // Car c=new Car();


        //possible

        Car c=new Ferrari();
        c.Engine();

        
                                                        //impossible
                                                    // Car f=new Limo();


       //poossible

      //  Ferrari ff=new Ferrari("Rohit");
       //This will execute right after calling it it will print the output
        
	}
}