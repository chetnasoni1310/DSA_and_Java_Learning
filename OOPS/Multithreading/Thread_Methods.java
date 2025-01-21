package OOPS.Multithreading;

class Mythread_3 extends Thread{
    public Mythread_3() {
    }
   public Mythread_3(Runnable task) {
        super(task);
    }

    @Override
    public void run() {
//        System.out.println("YOYO * " +this.getName());
        int i=0;
        while(i<5)
        {
            System.out.println("YOYO ************* " +this.getName());
            i++;
                            /// /************************ SLEEP BLOCK **************************
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
                           /// /************************ SLEEP BLOCK **************************

        }
    }
}

class Mythread_4 extends Thread{
    public Mythread_4() {
    }
   public Mythread_4(Runnable task) {
        super(task);
    }

    @Override
    public void run() {
//        System.out.println("YOYO * " +this.getName());
        int i=0;
        while(i<5)
        {
            System.out.println("YOYO * " +this.getName());
            i++;
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
   Mythread_3 t1=new Mythread_3();
   Mythread_4 t2=new Mythread_4();
   t1.start();
   try {
       t1.join();
   }catch(Exception e)
   {
       System.out.println(e);
   }
        System.out.println(t2.getState());
   t2.start();
        System.out.println(t2.getState());
    }
}
