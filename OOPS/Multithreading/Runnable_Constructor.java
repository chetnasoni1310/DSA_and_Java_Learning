package OOPS.Multithreading;

class Run_Constructor implements Runnable{
    @Override
    public void run() {
        System.out.println("I am in runnable run");
    }

    public Run_Constructor() {
    }

    public Run_Constructor(String name) {
        System.out.println("Run Name");
    }

    public Run_Constructor(Runnable r,String name) {
        System.out.println("Runnable str name and r");
    }
}
public class Runnable_Constructor {
    public static void main(String[] args) {
        Run_Constructor b1=new Run_Constructor("Chetna");
        Thread g1=new Thread(b1,"Chetna");

        g1.start();
        System.out.println("This is the id: "+g1.getId());
        System.out.println("This is the name: "+g1.getName());


        Run_Constructor b2=new Run_Constructor();
        Thread g2=new Thread(b2,"ChetnaSoni");

        g2.start();
        System.out.println("This is the id: "+g2.getId());
        System.out.println("This is the name: "+g2.getName());
    }
}
