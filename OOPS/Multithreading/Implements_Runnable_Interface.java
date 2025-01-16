package OOPS.Multithreading;

class MyThread_R1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<20;i++) {
            System.out.println("I am Thread 111 not a threat ");
        }
    }
}
class MyThread_R2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<20;i++) {
            System.out.println("I am Thread 222 not a threat ");
        }
    }
}
public class Implements_Runnable_Interface {
    public static void main(String[] args) {

        MyThread_R1 bullet1 = new MyThread_R1();
        Thread gun1=new Thread(bullet1);

        MyThread_R2 bullet2 = new MyThread_R2();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
