package OOPS.Multithreading;

class Myth extends Thread{
    public Myth() {
    }

    public Myth(String name) {
        super(name);
    }

    public Myth(Runnable task) {
        super(task);
    }

    @Override
    public void run() {
        System.out.println("YOYO");
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
            Myth t1=new Myth("Chetna_SOni_The_Great");
            t1.start();
        System.out.println("This is the myth id :"+t1.getId());
        System.out.println("This is the myth name: "+t1.getName());
<<<<<<< HEAD


        Myth t2=new Myth("Chetna_SOni_The_Super_Great");
        t2.start();
        System.out.println("This is the myth id :"+t2.getId());
        System.out.println("This is the myth name: "+t2.getName());


=======
        // Myth t2=new Myth("Chetna_SOni_The_Great");
        // t2.start();
        // System.out.println("This is the myth id :"+t2.getId());
        // System.out.println("This is the myth name: "+t2.getName());
>>>>>>> e17ca09ed084123fd5fa08393b0008d162bb3822
    }
}
