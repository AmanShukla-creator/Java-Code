package Threading.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadX t1 = new ThreadX(counter);
        ThreadX t2 = new ThreadX(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join(); // Wait for both threads to finish
        } 
        catch (Exception e) {
        }
        System.out.println(counter.getCount());
    }
        
}
