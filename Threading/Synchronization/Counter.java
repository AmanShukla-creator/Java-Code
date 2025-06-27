package Threading.Synchronization;

public class Counter {

    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;

        // public synchronized void increment() {
        //     count++;
        // } 
        // This is another way to synchronize the method
        }   
    }

    public int getCount() {
        return count;
    }
    
}
