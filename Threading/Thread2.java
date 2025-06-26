package Threading;

public class Thread2 extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
            Thread.sleep(2000); // Sleep for 20 seconds after the loop
        } catch (InterruptedException e) {
            System.out.println(e);
        }
            System.out.println("RUNNING " + i );
        }
        
    }
    public static void main(String[] args)  throws InterruptedException {
        Thread2 t2 = new Thread2();
        t2.start();
        t2.join();
        System.out.println("Thread has been completed.");
        
    }
    
}
