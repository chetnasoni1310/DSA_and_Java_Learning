package OOPS.Multithreading;



class MyThread1 extends Thread{
    public void run()
    {
        int i=0;
        while(i<=10)
        {
            System.out.println("Thread 1 is running");
            System.out.println("Cooking");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run()
    {   int i=0;
        while(i<=10)
        {
            System.out.println("Thread 2 is running");
            System.out.println("Chatting");
            i++;
        }
    }
}
public class Extends_Thread_Class {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}
