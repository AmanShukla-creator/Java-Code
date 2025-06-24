package Threading;

class Thread1 extends Thread {
    public void run(){

    }
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        System.out.println(t1.getState());
    }
}
