package Threading;

public class Thread4 extends Thread {
@Override
public void run(){
    
    try{
        Thread.sleep(1000);
        System.out.println("Thread is running");
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
}
public static void main(String[] args) {
    Thread4 t1 = new Thread4();
    t1.start();
}
    
}
