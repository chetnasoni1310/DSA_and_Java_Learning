package OOPS.Multithreading;

//import static java.lang.Thread.MAX_PRIORITY;

class Mythread_2 extends Thread{
    public Mythread_2() {
    }

    public Mythread_2(String name) {
        super(name);
    }

    public Mythread_2(Runnable task) {
        super(task);
    }

    @Override
    public void run() {
//        System.out.println("YOYO * " +this.getName());
        while(true)
        {
        System.out.println("YOYO * " +this.getName());
        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {


        Mythread_2 t1 = new Mythread_2("Chet");
        Mythread_2 t2 = new Mythread_2("naa");
        Mythread_2 t3 = new Mythread_2("Sonii");
        Mythread_2 t4 = new Mythread_2("Thee");
        Mythread_2 t5 = new Mythread_2("Greatt Most Important***********");
        t5.setPriority(Thread.MAX_PRIORITY);  //Ya toh yeh likhdo ya fir import karlo file upar jaise
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
