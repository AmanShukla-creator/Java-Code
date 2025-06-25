package Threading;
public class Thread3 extends Thread {
    public Thread3(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
            }
                catch(InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " - Priority " + Thread.currentThread().getPriority() + " - count: " + i);

        }
    }
    public static void main(String[] args) {
        Thread3 t1 = new Thread3("Lowest");
        Thread3 t2 = new Thread3("Medium");
        Thread3 t3 = new Thread3("Highest");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        
    }
}