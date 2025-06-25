package Threading;

public class Thread4 extends Thread {
    public Thread4(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - is running " );
            Thread.yield(); // Yielding the thread to allow other threads to run
        }
        // try{
        //     Thread.sleep(1000);
        //     System.out.println("Thread is running");
        // }
        // catch(InterruptedException e){
        //     System.out.println(e);
        // }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread4 t1 = new Thread4("t1");
        Thread4 t2 = new Thread4("t2");
        t1.start();
        t2.start();

        
    }
}
