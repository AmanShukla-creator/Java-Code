package Threading;

public class Daemon1 extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("Thread is running");
        }
    }
    public static void main(String[] args) {
        Daemon1 t1 = new Daemon1(); // User thread
        t1.setDaemon(true); // Setting t1 as a daemon thread
        t1.start();
        Daemon1 t2 = new Daemon1(); // User thread
        t2.start();
        System.out.println("Main thread is running");
    
    }
    
}   
